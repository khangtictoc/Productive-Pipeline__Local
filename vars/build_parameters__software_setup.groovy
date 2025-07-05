def call(){
    properties([
        parameters([
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'azure_data_studio__install',
                description: 'CPU Report',
                script: [
                    $class: 'GroovyScript',
                    script: [
                        script:
                            """
                            return ["Enabled", "Disabled"]
                            """
                    ]
                ]
            ],
            
        ])
    ])

}