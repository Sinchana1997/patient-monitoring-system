pipeline {
    agent any

    environment {
        FRONTEND_DIR = 'patient-monitoring-frontend'
    }

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main', credentialsId: 'github-token5', url: 'https://github.com/Sinchana1997/patient-monitoring-system.git'
            }
        }

        stage('Backend Build') {
            tools {
                maven 'Maven_3.9.10'
            }
            steps {
                bat 'mvn clean package -f patient-monitoring-system\\pom.xml'
            }
        }

        stage('Frontend Build') {
            steps {
                dir("${env.FRONTEND_DIR}") {
                    bat 'npm install'
                    bat 'ng build --configuration production'
                }
            }
        }

        stage('Deploy') {
            steps {
                bat 'scripts\\deploy.bat'
            }
        }
    }
}
