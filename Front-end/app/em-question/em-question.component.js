export var emQuestionComponent = {
    template: require('./em-question.temlate.html'),
    controller: emQuestionComponentController
};

function emQuestionComponentController($stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.questionId = $stateParams.questionId;
        $ctrl.question = {
            "id": $ctrl.questionId,
            "content": "Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.",
            "options": [
                {
                    "content": "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus.",
                    "value": 5
                },
                {
                    "content": "Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.",
                    "value": 2
                },
                {
                    "content": "Donec posuere metus vitae ipsum. Aliquam non mauris.",
                    "value": 1
                },
                {
                    "content": "Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit.",
                    "value": 3
                },
                {
                    "content": "Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.",
                    "value": 0
                },
                {
                    "content": "Duis at velit eu est congue elementum.",
                    "value": 4
                }
            ]
        }
    }
}