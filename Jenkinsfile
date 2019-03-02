pipeline {
    agent none    
    stages {
        stage("Preparation") {
            agent any
            steps {
                git poll: true, url: "https://github.com/F3r-n4nd0/goya.git"
                sh "echo 'Completed preparation'"
            }
        }
        stage("Build") {
            agent { 
                docker { image 'clojure:openjdk-8-lein-alpine'}
            }
            steps {
                sh "lein deps"
                sh "lein cljsbuild once"
                sh "echo 'Completed building'"
            }
        }
        stage("Package") {
            agent any
            steps {
                sh "rm -rf *.tar"
                // create a docker image
                sh "tar -C ./resources/ -czf fernando_goya.tar ."
                archiveArtifacts artifacts: '**/*tar'
                sh "echo 'Completed packaging'"
            }
        }
        stage("Installation approval") {
            agent any
            steps {
                input "Should we deploy this pipeline to production?"
            }
        }
        stage("Install") {
            agent any
            steps {
                sshagent(credentials: ['studen']) {
                    // upload artifact to PROD machine
                    sh "scp -o StrictHostKeyChecking=no fernando_goya.tar studen@45.33.50.232:~/."
                    // stop current applications from working
                    sh """ 
                        ssh -o StrictHostKeyChecking=no studen@45.33.50.232 \
                        mkdir -p ~/fernando-goya
                    """
                    // import/install the artifact in the machine
                    sh """
                        ssh -o StrictHostKeyChecking=no studen@45.33.50.232 \
                        tar -xzf fernando_goya.tar -C ./fernando-goya/
                    """
                    // run the service/application
                    sh """
                        ssh -o StrictHostKeyChecking=no studen@45.33.50.232 \
                        [ ! '$(docker ps -a | grep fernando/goya)' ] && docker run --rm -d -p 10500:80 --name fernando/goya -v ~/fernando-goya/:/usr/share/nginx/html:ro nginx:alpine
                    """
                    sh """
                        ssh -o StrictHostKeyChecking=no studen@45.33.50.232 \
                        [ ! $(docker inspect -f '{{.State.Running}}' fernando/goya ) ] && docker run --rm -d -p 10500:80 --name some-nginx -v ~/fernando-goya/:/usr/share/nginx/html:ro nginx:alpine
                    """
                    sh "echo 'Completed installation'"    
                }
            }
        }
    }
}
