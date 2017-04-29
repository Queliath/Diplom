export var emPassTestComponent = {
    template: require('./em-pass-test.template.html'),
    controller: emPassTestComponentController
};

function emPassTestComponentController(testService, questionService, answerOptionService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.testId = $stateParams.testId;
        testService.getTestById($ctrl.testId).then(function (test) {
            $ctrl.test = test;
        });
        questionService.getQuestionsByTestId($ctrl.testId).then(function (questions) {
            $ctrl.questions = questions;
            $ctrl.currentQuestionNumber = 1;
            $ctrl.questionChanged();
        });
    };

    $ctrl.questionChanged = function () {
        $ctrl.currentQuestion = $ctrl.questions[$ctrl.currentQuestionNumber - 1];
        answerOptionService.getAnswerOptionsByQuestionId($ctrl.currentQuestion.id).then(function (options) {
            $ctrl.currentOptions = options;
        });
    };
}