pipeline {
    agent any

    environment {
        APP_NAME = "MyApp"
        VERSION = "1.0.0"
    }

    stages {
        stage('Info') {
            steps {
                echo "Deploying ${APP_NAME} version ${VERSION}"
            }
        }
    }
}
