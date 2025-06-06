pipeline {
    agent any

    environment {
        FRONTEND_DIR = 'patient-monitoring-frontend'
    }

    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/Sinchana1997/patient-monitoring-system.git'
            
            }
        }

        stage('Backend Build') {
            steps {
                sh 'mvn clean package -f patient-monitoring-backend/pom.xml'
            }
        }

        stage('Frontend Build') {
            steps {
                dir("${env.FRONTEND_DIR}") {
                    sh 'npm install'
                    sh 'ng build --configuration production'
                }
            }
        }

        stage('Deploy') {
            steps {
                sh './scripts/deploy.sh'
            }
        }
    }
}
