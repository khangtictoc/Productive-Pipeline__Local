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
            
        ])
    ])

}