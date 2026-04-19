pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building project...'
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }
    }
}