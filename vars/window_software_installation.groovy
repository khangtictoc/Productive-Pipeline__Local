def call(){
    script{
        powershell(returnStatus: true, script:
            """
            if (!(Test-Path -Path '${reportPath}')) {
                New-Item -ItemType Directory -Path '${reportPath}'
            }
            Invoke-WebRequest -Uri https://raw.githubusercontent.com/khangtictoc/Productive-Pipeline__Local/refs/heads/main/powershell_script/window_software_installation__coding_app.ps1 -OutFile window_software_installation__coding_app.ps1
            . ./window_software_installation__coding_app.ps1
            """
        )
    }
}