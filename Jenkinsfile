@Library("general-shared-lib@main") _

build_parameters()

pipeline {
    agent any
    stages {
        stage('Load parameter') {
            steps {
                echo "${cpu_report}"
                echo "${memory_report}"
                echo "${disk_report}"
                echo "${network_report}"
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