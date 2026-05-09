pipeline {
    agent any

    stages {
        stage('Linux Commands') {
            steps {
                sh 'pwd'
                sh 'ls -la'
            }
        }
    }
}
