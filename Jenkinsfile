@Library("general-shared-lib@main") _



pipeline {
    agent any
    stages {
        stage('Load parameter') {
            steps {
                build_parameters()
                echo "${params.cpu_report}"
                echo "${params.memory_report}"
                echo "${params.disk_report}"
                echo "${params.network_report}"
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