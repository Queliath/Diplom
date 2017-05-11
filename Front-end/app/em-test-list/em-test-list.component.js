export var emTestListComponent = {
    template: require('./em-test-list.template.html'),
    controller: emTestListComponentController
};

function emTestListComponentController(testService, modalService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        loadTests();
    };

    $ctrl.openAddTestModal = function () {
        modalService.openAddTestModal().result.then(function () {
            loadTests();
        });
    };

    function loadTests() {
        testService.getTests().then(function (tests) {
            $ctrl.tests = tests;
        });
    }
}