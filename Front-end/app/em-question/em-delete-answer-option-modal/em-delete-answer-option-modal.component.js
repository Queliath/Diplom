export var emDeleteAnswerOptionModalComponent = {
    template: require('./em-delete-answer-option-modal.template.html'),
    controller: emDeleteAnswerOptionModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emDeleteAnswerOptionModalComponentController(answerOptionService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.answerOptionId = $ctrl.resolve.answerOptionId;
    };

    $ctrl.deleteAnswerOption = function () {
        answerOptionService.deleteAnswerOption($ctrl.answerOptionId).then(function () {
            $ctrl.close();
        });
    };
}