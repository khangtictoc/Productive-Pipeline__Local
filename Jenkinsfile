@Library("general-shared-lib@main") _



pipeline {
    agent any
    stages {
        stage('Load parameter') {
            steps {
                build_parameters()
            }
        }
        // stage('Approve Execute') {
        //     steps {
        //         script {
        //             input message: 'Do you want to run the benchmark?', submitter: 'virus'
        //         }
        //     }
        // }
        stage('Network Measuring') {
            steps {
                script {
                    if (powershell(script: 'Get-Command speedtest -ErrorAction SilentlyContinue', returnStatus: true) != 0) {
                        powershell '''
                        Invoke-WebRequest -Uri https://packagecloud.io/install/repositories/ookla/speedtest-cli/script.ps1 -OutFile script.ps1
                        .\\script.ps1
                        Install-Package -Name speedtest -Force
                        '''
                    } else {
                        echo "yes"
                    }
                }
            }
        }
    }
}