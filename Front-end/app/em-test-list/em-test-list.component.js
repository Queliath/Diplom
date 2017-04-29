export var emTestListComponent = {
    template: require('./em-test-list.template.html'),
    controller: emTestListComponentController
};

function emTestListComponentController(testService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        testService.getTests().then(function (tests) {
            $ctrl.tests = tests;
        });
    };
}