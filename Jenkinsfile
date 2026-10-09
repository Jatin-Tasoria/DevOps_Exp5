pipeline {
    agent any

    tools {
        jdk 'JDK'
        maven 'Maven'
    }

    stages {
        stage('Git Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Jatin-Tasoria/DevOps_Exp5.git'
            }
        }

        stage('Build') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Validate') {
            steps {
                bat 'mvn validate'
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Verify') {
            steps {
                bat 'mvn verify'
            }
        }

        stage('Install') {
            steps {
                bat 'mvn install'
            }
        }

        stage('Site') {
            steps {
                bat 'mvn site'
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
        always {
            echo 'Pipeline execution finibated.'
        }
    }
}
