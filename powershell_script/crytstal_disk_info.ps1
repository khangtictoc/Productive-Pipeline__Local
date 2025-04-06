# Define variables
$downloadUrl = "https://onboardcloud.dl.sourceforge.net/project/crystaldiskinfo/9.6.3/CrystalDiskInfo9_6_3.zip?viasf=1"
$zipFilePath = "CrystalDiskInfo.zip"
$extractPath = "CrystalDiskInfo"
$outputFile = "DiskInfo.txt"
$destinationPath = "C:\Temp\$outputFile"

# Create destination directory if it doesn't exist
if (!(Test-Path -Path "C:\Temp")) {
    New-Item -ItemType Directory -Path "C:\Temp" | Out-Null
}

# Download the zip file
Invoke-WebRequest -Uri $downloadUrl -OutFile $zipFilePath

# Extract the zip file
Expand-Archive -Path $zipFilePath -DestinationPath $extractPath -Force

# Run the DiskInfo64.exe command
Start-Process -FilePath "$extractPath\DiskInfo64.exe" -ArgumentList "/CopyExit" -Wait

# Copy the entire extracted folder to the destination
$destinationFolder = "C:\Temp\CrystalDiskInfo"
if (Test-Path -Path $destinationFolder) {
    Remove-Item -Path $destinationFolder -Recurse -Force
}
Copy-Item -Path $extractPath -Destination $destinationFolder -Recurse -Force

# Copy the output file to the destination
Copy-Item -Path "$extractPath\$outputFile" -Destination $destinationPath -Force

# Clean up temporary files
Remove-Item -Path $zipFilePath -Force
Remove-Item -Path $extractPath -Recurse -Force
