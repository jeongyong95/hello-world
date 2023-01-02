pipeline {
  agent any
  stages {
    stage('source') {
      steps {
        git(url: 'https://github.com/jeongyong95/hello-world.git', branch: 'master')
      }
    }

    stage('build') {
      steps {
        tool 'gradle'
      }
    }

    stage('deploy') {
      steps {
        sh 'echo "deploying hello-world completed"'
      }
    }

  }
}