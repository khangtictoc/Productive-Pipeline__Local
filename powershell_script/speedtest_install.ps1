# Define the URL for the Speedtest MSI installer
$msiUrl = "https://install.speedtest.net/app/windows/latest/speedtestbyookla_x64.msi"
$msiFilePath = "$env:TEMP\speedtestbyookla_x64.msi"

# Download the Speedtest MSI file
Write-Host "Downloading Speedtest MSI installer..."
Invoke-WebRequest -Uri $msiUrl -OutFile $msiFilePath


