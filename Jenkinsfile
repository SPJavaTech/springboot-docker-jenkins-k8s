pipeline {
    agent any

    environment {
        IMAGE_NAME = 'dockerjenkinsk8s'
    }

    stages {
        stage('Build JAR') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t ${IMAGE_NAME} ."
            }
        }

        stage('Run Docker Container') {
            steps {
                sh "docker rm -f ${IMAGE_NAME} || true"
                sh "docker run -d -p 8080:8080 --name ${IMAGE_NAME} ${IMAGE_NAME}"
            }
        }
    }
}