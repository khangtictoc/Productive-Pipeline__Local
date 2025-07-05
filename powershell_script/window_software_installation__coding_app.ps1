# PowerShell script to install applications if not already installed

# Function to check if an application is installed
function Is-AppInstalled {
    param (
        [string]$AppName
    )
    $keyPaths = @(
        "HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall\*",
        "HKLM:\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\Uninstall\*"
    )

    foreach ($key in $keyPaths) {
        $apps = Get-ItemProperty $key -ErrorAction SilentlyContinue | Where-Object {
            $_.DisplayName -and $_.DisplayName.Contains($AppName)
        }
        if ($apps.Count -gt 0) {
            return $true
        }
    }
    return $false
}

# Install Azure Data Studio
if (-not (Is-AppInstalled "Azure Data Studio")) {
    Write-Host "Installing Azure Data Studio..."
    $adsUrl = "https://aka.ms/azuredatastudio-windows"
    $adsInstaller = "$env:TEMP\azuredatastudio.exe"
    Invoke-WebRequest $adsUrl -OutFile $adsInstaller
    Start-Process -FilePath $adsInstaller -ArgumentList "/silent" -Wait
    Remove-Item $adsInstaller
} else {
    Write-Host "Azure Data Studio is already installed. Skipping."
}

# Install Calibre
if (-not (Is-AppInstalled "calibre")) {
    Write-Host "Installing Calibre..."
    $calibreUrl = "https://download.calibre-ebook.com/7.12.0/calibre-64bit-7.12.0.msi"  # Change version if needed
    $calibreInstaller = "$env:TEMP\calibre.msi"
    Invoke-WebRequest $calibreUrl -OutFile $calibreInstaller
    Start-Process "msiexec.exe" -ArgumentList "/i `"$calibreInstaller`" /qn" -Wait
    Remove-Item $calibreInstaller
} else {
    Write-Host "Calibre is already installed. Skipping."
}

# Install Cloudflare Warp
if (-not (Is-AppInstalled "Cloudflare")) {
    Write-Host "Installing Cloudflare WARP..."
    $warpUrl = "https://install.cloudflarewarp.com/Cloudflare_WARP_Release-x64.msi"
    $warpInstaller = "$env:TEMP\cloudflarewarp.msi"
    Invoke-WebRequest $warpUrl -OutFile $warpInstaller
    Start-Process "msiexec.exe" -ArgumentList "/i `"$warpInstaller`" /qn" -Wait
    Remove-Item $warpInstaller
} else {
    Write-Host "Cloudflare WARP is already installed. Skipping."
}

# Install CrystalDiskInfo
if (-not (Is-AppInstalled "CrystalDiskInfo")) {
    Write-Host "Installing CrystalDiskInfo..."
    $cdiUrl = "https://osdn.net/projects/crystaldiskinfo/downloads/79546/CrystalDiskInfo8_17_14.exe"  # Update version if needed
    $cdiInstaller = "$env:TEMP\CrystalDiskInfo.exe"
    Invoke-WebRequest $cdiUrl -OutFile $cdiInstaller
    Start-Process -FilePath $cdiInstaller -ArgumentList "/S" -Wait
    Remove-Item $cdiInstaller
} else {
    Write-Host "CrystalDiskInfo is already installed. Skipping."
}

# Install CrystalDiskMark
if (-not (Is-AppInstalled "CrystalDiskMark")) {
    Write-Host "Installing CrystalDiskMark..."
    $cdmUrl = "https://osdn.net/projects/crystaldiskmark/downloads/79560/CrystalDiskMark8_0_4.exe"  # Update version if needed
    $cdmInstaller = "$env:TEMP\CrystalDiskMark.exe"
    Invoke-WebRequest $cdmUrl -OutFile $cdmInstaller
    Start-Process -FilePath $cdmInstaller -ArgumentList "/S" -Wait
    Remove-Item $cdmInstaller
} else {
    Write-Host "CrystalDiskMark is already installed. Skipping."
}

Write-Host "All installations checked and completed."
