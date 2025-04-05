def build_parameter(){
    properties([
        parameters([
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'CPU Report',
                choices: ['Enable', 'Disable'].join('\n')
            ],
            [
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'Memory Report',
                choices: ['Enable', 'Disable'].join('\n')
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'Disk Report',
                choices: ['Enable', 'Disable'].join('\n')
            ],[
                $class: 'ChoiceParameter',
                choiceType: 'PT_RADIO',
                name: 'Network Report',
                choices: ['Enable', 'Disable'].join('\n')
            ]
        ])
    ])

}