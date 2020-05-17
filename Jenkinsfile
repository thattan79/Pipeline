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
    stage('deploy') {
                steps {
                    deploy adapters: [tomcat8(credentialsId: '2a07e0ac-531b-4517-ba26-3ffc6fc223b4', path: '', url: 'http://localhost:9090')], contextPath: 'pipeline', war: '**/*.war'
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
