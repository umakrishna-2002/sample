pipeline {
    agent { label 'node' }

    stages {

        stage('Clone Repo') {
            steps {
                git branch: 'main', url: 'https://github.com/umakrishna-2002/sample.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t my-html-app .'
            }
        }

        stage('Stop Old Container') {
            steps {
                sh 'docker rm -f myhtml || true'
            }
        }

        stage('Run New Container') {
            steps {
                sh 'docker run -d -p 80:80 --name myhtml my-html-app'
            }
        }
    }
}
