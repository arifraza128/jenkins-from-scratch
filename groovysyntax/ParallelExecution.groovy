pipeline {
    agent any

    stages {
        stage('Parallel Jobs') {
            parallel {
                stage('Frontend') {
                    steps {
                        echo 'Building frontend'
                    }
                }

                stage('Backend') {
                    steps {
                        echo 'Building backend'
                    }
                }
            }
        }
    }
}
