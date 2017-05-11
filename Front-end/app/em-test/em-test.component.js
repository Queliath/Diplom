export var emTestComponent = {
    template: require('./em-test.template.html'),
    controller: emTestComponentController
};

function emTestComponentController(testService, questionService, $stateParams, $state, modalService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.testId = $stateParams.testId;
        loadTest();
        questionService.getQuestionsByTestId($ctrl.testId).then(function (questions) {
            $ctrl.questions = questions;
        });
    };

    $ctrl.openEditTestModal = function () {
        modalService.openEditTestModal($ctrl.testId).result.then(function () {
            loadTest();
        });
    };

    $ctrl.openDeleteTestModal = function () {
        modalService.openDeleteTestModal($ctrl.testId).result.then(function () {
            $state.go("tests");
        });
    };

    function loadTest() {
        testService.getTestById($ctrl.testId).then(function (test) {
            $ctrl.test = test;
        });
    }
}