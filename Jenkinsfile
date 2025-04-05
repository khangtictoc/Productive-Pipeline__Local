@Library("general-shared-lib@main") _

build_parameters()

pipeline {
    agent any
    stages {
        stage('Load parameter') {
            steps {
                echo ${params.cpu_report}
                echo ${params.memory_report}
                echo ${params.disk_report}
                echo ${params.network_report}
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