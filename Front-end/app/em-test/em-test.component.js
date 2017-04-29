export var emTestComponent = {
    template: require('./em-test.template.html'),
    controller: emTestComponentController
};

function emTestComponentController(testService, questionService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.testId = $stateParams.testId;
        testService.getTestById($ctrl.testId).then(function (test) {
            $ctrl.test = test;
        });
        questionService.getQuestionsByTestId($ctrl.testId).then(function (questions) {
            $ctrl.questions = questions;
        });
    };
}