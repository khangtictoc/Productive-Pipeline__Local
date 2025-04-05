def call(){
    properties([
        parameters([
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'cpu_report',
                description: 'CPU Report',
                groovyScript: [
                    classpath: [],
                    script: 
                    """
                        return ['Enable', 'Disable']
                    """
                ]
            ],
            // [
            //     $class: 'ChoiceParameter',
            //     choiceType: 'PT_RADIO',
            //     name: 'memory_report',
            //     description: 'Memory Report',
            //     choices: ['Enable', 'Disable']
            // ],[
            //     $class: 'ChoiceParameter',
            //     choiceType: 'PT_RADIO',
            //     name: 'disk_report',
            //     description: 'Disk Report',
            //     choices: ['Enable', 'Disable']
            // ],[
            //     $class: 'ChoiceParameter',
            //     choiceType: 'PT_RADIO',
            //     name: 'network_report',
            //     description: 'Network Report',
            //     choices: ['Enable', 'Disable']
            // ]
        ])
    ])

}