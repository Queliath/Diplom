export var emQuestionComponent = {
    template: require('./em-question.temlate.html'),
    controller: emQuestionComponentController
};

function emQuestionComponentController(questionService, answerOptionService, $stateParams, $state, modalService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.questionId = $stateParams.questionId;
        loadQuestion();
        loadAnswerOptions();
    };

    $ctrl.openEditQuestionModal = function () {
        modalService.openEditQuestionModal($ctrl.questionId).result.then(function () {
            loadQuestion();
        })
    };

    $ctrl.openDeleteQuestionModal = function () {
        modalService.openDeleteQuestionModal($ctrl.questionId).result.then(function () {
            $state.go("test", { testId: $ctrl.question.testId });
        })
    };

    function loadQuestion() {
        questionService.getQuestionById($ctrl.questionId).then(function (question) {
            $ctrl.question = question;
        });
    }

    function loadAnswerOptions() {
        answerOptionService.getAnswerOptionsByQuestionId($ctrl.questionId).then(function (options) {
            $ctrl.options = options;
        });
    }
}