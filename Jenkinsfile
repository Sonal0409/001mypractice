pipeline {
  agent any
  stages {
    stage('CloneRepo') {
      parallel {
        stage('CloneRepo') {
          steps {
            git(url: 'https://github.com/Sonal0409/JavaWebCalculator.git', branch: 'master')
          }
        }

        stage('Test') {
          steps {
            sh 'mvn test'
          }
        }

        stage('package') {
          steps {
            sh 'mvn package'
          }
        }

      }
    }

  }
}