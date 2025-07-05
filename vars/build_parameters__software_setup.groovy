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
            
        ])
    ])

}