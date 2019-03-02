pipeline {
  agent none
  stages {
    stage('Build') {
      agent { 
        docker { image 'clojure:openjdk-8-lein-alpine'}
      }
      steps {
        sh 'lein deps'
        sh 'lein cljsbuild once'
      }
    }
  }
}
