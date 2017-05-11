export var emAddAnswerOptionModalComponent = {
    template: require('./em-add-answer-option-modal.template.html'),
    controller: emAddAnswerOptionModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emAddAnswerOptionModalComponentController($stateParams, answerOptionService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.answerOption = {
            questionId: $stateParams.questionId
        };
    };

    $ctrl.save = function () {
        answerOptionService.addAnswerOption($ctrl.answerOption).then(function (answerOption) {
            $ctrl.close();
        });
    };
}