export var emAddQuestionModalComponent = {
    template: require('./em-add-question-modal.template.html'),
    controller: emAddQuestionModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emAddQuestionModalComponentController(questionService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.question = {
            testId: $stateParams.testId
        };
    };

    $ctrl.save = function () {
        questionService.addQuestion($ctrl.question).then(function (addedQuestion) {
            $ctrl.close();
        });
    };
}