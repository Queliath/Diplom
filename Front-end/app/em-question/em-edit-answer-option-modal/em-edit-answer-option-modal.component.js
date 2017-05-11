export var emEditAnswerOptionModalComponent = {
    template: require('./em-edit-answer-option-modal.template.html'),
    controller: emEditAnswerOptionModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emEditAnswerOptionModalComponentController($stateParams, answerOptionService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.answerOptionId = $ctrl.resolve.answerOptionId;
        answerOptionService.getAnswerOptionById($ctrl.answerOptionId).then(function (answerOption) {
            $ctrl.answerOption = answerOption;
            $ctrl.answerOption.questionId = $stateParams.questionId;
        });
    };

    $ctrl.save = function () {
        answerOptionService.editAnswerOption($ctrl.answerOption).then(function (answerOption) {
            $ctrl.close();
        });
    };
}