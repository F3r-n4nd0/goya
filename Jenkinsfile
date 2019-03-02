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
                sh "docker build -t fernando/goya - << EOF
                    FROM nginx
                    COPY ./resources /usr/share/nginx/html
                    EXPOSE 80
                    EOF"
                // export the image to a TAR file
                sh "docker save -o fernando_goya.tar fernando/goya"
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
                sh "echo 'Completed installation'"  
            }
        }
    }
}
