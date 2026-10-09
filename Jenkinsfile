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
                    url: 'https://github.com/username/my-maven-project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Validate') {
            steps {
                sh 'mvn validate'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Verify') {
            steps {
                sh 'mvn verify'
            }
        }

        stage('Install') {
            steps {
                sh 'mvn install'
            }
        }

        stage('Site') {
            steps {
                sh 'mvn site'
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
            echo 'Pipeline execution finished.'
        }
    }
}
