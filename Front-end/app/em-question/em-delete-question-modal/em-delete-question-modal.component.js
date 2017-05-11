export var emDeleteQuestionModalComponent = {
    template: require('./em-delete-question-modal.template.html'),
    controller: emDeleteQuestionModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emDeleteQuestionModalComponentController(questionService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.questionId = $ctrl.resolve.questionId;
    };

    $ctrl.deleteQuestion = function () {
        questionService.deleteQuestion($ctrl.questionId).then(function () {
            $ctrl.close();
        });
    };
}