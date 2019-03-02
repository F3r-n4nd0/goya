pipeline {
  agent {
    docker {
      image 'clojure:openjdk-8-lein-alpine'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'lein deps'
      }
    }
  }
}