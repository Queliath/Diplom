export var emPassTestComponent = {
    template: require('./em-pass-test.template.html'),
    controller: emPassTestComponentController
};

function emPassTestComponentController(testService, questionService, answerOptionService, testResultService, $stateParams, $state, $timeout, $interval, modalService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.employeeId = $stateParams.employeeId;
        $ctrl.testPeriodId = $stateParams.testPeriodId;
        $ctrl.testId = $stateParams.testId;
        testService.getTestById($ctrl.testId).then(function (test) {
            $ctrl.test = test;
            $ctrl.timeForPassingTest = new Date($ctrl.test.fixedTime * 60 * 1000);
            $interval(function () {
                $ctrl.timeForPassingTest.setSeconds($ctrl.timeForPassingTest.getSeconds() - 1);
            }, 1000);
            $timeout(testCompleted, $ctrl.test.fixedTime * 60 * 1000);
        });
        questionService.getQuestionsByTestId($ctrl.testId).then(function (questions) {
            $ctrl.questions = questions;
            $ctrl.currentQuestionNumber = 1;
            loadQuestion();
        });
        $ctrl.answers = [];
    };

    $ctrl.optionSelected = function () {
        $ctrl.answers.push($ctrl.selectedOption);
        if ($ctrl.currentQuestionNumber == $ctrl.test.questionsCount) {
            testCompleted();
        } else {
            $ctrl.currentQuestionNumber++;
            loadQuestion();
        }
    };

    function testCompleted() {
        testResultService.sendTestAnswers($ctrl.employeeId, $ctrl.testPeriodId, $ctrl.testId, $ctrl.answers).then(function (testResult) {
            modalService.openTestResultModal(testResult).result.then(function () {
                $state.go("testTasks", { employeeId: $ctrl.employeeId });
            });
        });
    }

    function loadQuestion() {
        $ctrl.currentQuestion = $ctrl.questions[$ctrl.currentQuestionNumber - 1];
        answerOptionService.getAnswerOptionsByQuestionId($ctrl.currentQuestion.id).then(function (options) {
            $ctrl.currentOptions = options;
        });
    }
}