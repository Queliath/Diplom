export var emEditQuestionModalComponent = {
    template: require('./em-edit-question-modal.template.html'),
    controller: emEditQuestionModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emEditQuestionModalComponentController(questionService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.questionId = $ctrl.resolve.questionId;
        questionService.getQuestionById($ctrl.questionId).then(function (question) {
            $ctrl.question = question;
        });
    };

    $ctrl.save = function () {
        questionService.editQuestion($ctrl.question).then(function (question) {
            $ctrl.close();
        });
    };
}