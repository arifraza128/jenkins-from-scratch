def services = ['auth', 'payment', 'orders']

pipeline {
    agent any

    stages {
        stage('Dynamic Stages') {
            steps {
                script {
                    services.each { service ->
                        echo "Building ${service}"
                    }
                }
            }
        }
    }
}
