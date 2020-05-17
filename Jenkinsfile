pipeline {
    agent any
    stages {
        stage('preperation') {
            steps {
                git 'https://github.com/thattan79/Pipeline.git'
            }
        }
            stage('clean') {
                steps {
                    bat "mvn clean"
                }
        }
            stage('package') {
                steps {
                    bat "mvn package"
                }
        }
            stage('Results') {
                steps {
                    junit "**/target/surefire-reports/TEST-*.xml"
                    archive "target/*.war"
                }
        }
    }
}
