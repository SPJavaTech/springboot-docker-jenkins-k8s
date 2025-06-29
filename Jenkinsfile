pipeline {
    agent any

    environment {
        IMAGE_NAME = 'dockerjenkinsk8s'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'phase-3-jenkins-pipeline', url: 'https://github.com/SPJavaTech/springboot-docker-jenkins-k8s.git'
            }
        }

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

        stage('Run Docker Image') {
            steps {
                sh "docker rm -f ${IMAGE_NAME} || true"
                sh "docker run -d -p 8080:8080 --name ${IMAGE_NAME} ${IMAGE_NAME}"
            }
        }
    }
}
