export var emQuestionComponent = {
    template: require('./em-question.temlate.html'),
    controller: emQuestionComponentController
};

function emQuestionComponentController(questionService, answerOptionService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.questionId = $stateParams.questionId;
        questionService.getQuestionById($ctrl.questionId).then(function (question) {
            $ctrl.question = question;
        });
        answerOptionService.getAnswerOptionsByQuestionId($ctrl.questionId).then(function (options) {
            $ctrl.options = options;
        });
    };
}