@Library("general-shared-lib@main") _

build_parameters()

pipeline {
    agent any
    stages {
        stage('Load parameter') {
            steps {
                echo "Hello world"
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