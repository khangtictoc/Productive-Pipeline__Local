def call(){
    properties([
        parameters([
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'azure_data_studio__install',
                description: 'Azure Data Studio Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'calibre__install',
                description: 'Calibre Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'cloudflare_warp__install',
                description: 'Cloudflare Warp Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'crystal_disk_info__install',
                description: 'CrystalDiskInfo Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'crystal_disk_mark__install',
                description: 'CrystalDiskMark Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'cursor__install',
                description: 'Cursor Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'cyberduck__install',
                description: 'Cyberduck Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'dbeaver__install',
                description: 'DBeaver Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'discord__install',
                description: 'Discord Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'docker_desktop__install',
                description: 'Docker Desktop Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'git__install',
                description: 'Git Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'intellij__install',
                description: 'IntelliJ Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'visual_studio__install',
                description: 'Visual Studio Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'vscode__install',
                description: 'VSCode Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'mongo_compass__install',
                description: 'MongoDB Compass Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'notion__install',
                description: 'Notion Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'obs__install',
                description: 'OBS Studio Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'postman__install',
                description: 'Postman Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'powertoys__install',
                description: 'PowerToys Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 's3_browser__install',
                description: 'S3 Browser Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'steam__install',
                description: 'Steam Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'telegram__install',
                description: 'Telegram Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'treesize__install',
                description: 'TreeSize Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'ultraiso__install',
                description: 'UltraISO Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'vlc__install',
                description: 'VLC Media Player Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'vmware_workstation__install',
                description: 'VMware Workstation Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'winmerge__install',
                description: 'WinMerge Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'winrar__install',
                description: 'WinRAR Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'wireshark__install',
                description: 'Wireshark Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'zalo__install',
                description: 'Zalo Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'zoom__install',
                description: 'Zoom Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'notion__install',
                description: 'Notion Installation',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Install', 'Skip']
                            """
                    ]
                ]
            ]
        ])
    ])

}