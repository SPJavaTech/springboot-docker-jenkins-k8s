pipeline {
    agent any

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
                sh 'docker build -t docker-jenkin-k8s .'
            }
        }

        stage('Run Docker Image') {
            steps {
                sh 'docker run -d -p 8080:8080 docker-jenkin-k8s'
            }
        }
    }
}