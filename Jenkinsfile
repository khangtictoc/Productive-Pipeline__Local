@Library("general-shared-lib@main") _

def reportPath = "C:/Temp"

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
                    powershell(returnStatus: true, script:
                        """
                        if (!(Test-Path -Path '${reportPath}')) {
                            New-Item -ItemType Directory -Path '${reportPath}'
                        }
                        Invoke-WebRequest -Uri https://raw.githubusercontent.com/khangtictoc/Productive-Pipeline__Local/refs/heads/main/powershell_script/speedtest.ps1 -OutFile speedtest.ps1
                        . ./speedtest.ps1 | Out-File -FilePath "${reportPath}/NetworkReport.txt" -Encoding utf8
                        """
                    )
                }
            }
        }
    }
}