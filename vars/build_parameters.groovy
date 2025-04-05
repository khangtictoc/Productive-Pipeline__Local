def call(){
    properties([
        parameters([
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'cpu_report',
                description: 'CPU Report',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Enable', 'Disable']
                            """
                    ]
                ]
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'memory_report',
                description: 'Memory Report',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Enable', 'Disable']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'disk_report',
                description: 'Disk Report',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Enable', 'Disable']
                            """
                    ]
                ]
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'network_report',
                description: 'Network Report',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ['Enable', 'Disable']
                            """
                    ]
                ]
            ]
        ])
    ])

}