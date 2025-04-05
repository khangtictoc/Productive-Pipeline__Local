@Library("general-shared-lib@main") _

pipeline {
    agent any
    stages {
        stage('Load parameter') {
            steps {
                
            }
        }
        stage('Approve Execute') {
            steps {
                script {
                    input message: 'Do you want to run the benchmark?', submitter: 'virus'
                }
            }
        }
    }
}