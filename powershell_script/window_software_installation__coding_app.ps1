# PowerShell script to install applications silently if not already installed

# Run script as admin if not already
if (-not ([Security.Principal.WindowsPrincipal] `
        [Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole(`
        [Security.Principal.WindowsBuiltInRole]::Administrator)) {
    Write-Host "Restarting script as administrator..."
    Start-Process -FilePath "powershell.exe" -ArgumentList "-NoProfile -ExecutionPolicy Bypass -File `"$PSCommandPath`"" -Verb RunAs
    exit
}

# Function to check if an application is installed
function Is-AppInstalled {
    param (
        [string]$AppName
    )
    $key = "HKLM:\SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall\*"
    $keyWow = "HKLM:\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\Uninstall\*"
    $apps = Get-ItemProperty $key, $keyWow -ErrorAction SilentlyContinue | Where-Object {
        $_.DisplayName -like "*$AppName*"
    }
    return $apps.Count -gt 0
}

# Function to download and install
function Install-App {
    param (
        [string]$AppName,
        [string]$Url,
        [string]$InstallerPath,
        [string]$SilentArgs
    )
    if (-not (Is-AppInstalled $AppName)) {
        Write-Host "`nInstalling $AppName..."
        Invoke-WebRequest $Url -OutFile $InstallerPath -UseBasicParsing
        Start-Process -FilePath $InstallerPath -ArgumentList $SilentArgs -Wait -NoNewWindow
        Remove-Item $InstallerPath -Force
        Write-Host "$AppName installation completed.`n"
    } else {
        Write-Host "$AppName is already installed. Skipping.`n"
    }
}

# Install Azure Data Studio
Install-App `
    -AppName "Azure Data Studio" `
    -Url "https://download.microsoft.com/download/6b2bfeac-9c1b-4182-9a2f-ce86ff8cc371/azuredatastudio-windows-setup-1.52.0.exe" `
    -InstallerPath "$env:TEMP\azuredatastudio.exe" `
    -SilentArgs "/VERYSILENT /NORESTART /SUPPRESSMSGBOXES"

# Install Calibre
Install-App `
    -AppName "calibre" `
    -Url "https://download.calibre-ebook.com/8.5.0/calibre-64bit-8.5.0.msi" `
    -InstallerPath "$env:TEMP\calibre.msi" `
    -SilentArgs "/qn /norestart"

# Install Cloudflare WARP
Install-App `
    -AppName "Cloudflare WARP" `
    -Url "https://install.cloudflarewarp.com/Cloudflare_WARP_Release-x64.msi" `
    -InstallerPath "$env:TEMP\cloudflarewarp.msi" `
    -SilentArgs "/qn /norestart"

# Install CrystalDiskInfo
Install-App `
    -AppName "CrystalDiskInfo" `
    -Url "https://zenlayer.dl.sourceforge.net/project/crystaldiskinfo/9.7.0/CrystalDiskInfo9_7_0Ads.exe?viasf=1" `
    -InstallerPath "$env:TEMP\CrystalDiskInfo.exe" `
    -SilentArgs "/VERYSILENT /SUPPRESSMSGBOXES /NORESTART"

# Install CrystalDiskMark
Install-App `
    -AppName "CrystalDiskMark" `
    -Url "https://zenlayer.dl.sourceforge.net/project/crystaldiskmark/9.0.1/CrystalDiskMark9_0_1Ads.exe?viasf=1" `
    -InstallerPath "$env:TEMP\CrystalDiskMark.exe" `
    -SilentArgs "/VERYSILENT /SUPPRESSMSGBOXES /NORESTART"

Write-Host "✅ All installations checked and completed successfully."
