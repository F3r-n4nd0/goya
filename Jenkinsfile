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
    }
}
