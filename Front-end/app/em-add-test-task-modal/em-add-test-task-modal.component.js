export var emAddTestTaskModalComponent = {
    template: require("./em-add-test-task-modal.template.html"),
    controller: emAddTestTaskModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emAddTestTaskModalComponentController(testTaskService, testService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.employeeId = $stateParams.employeeId;
    };

    $ctrl.getTestsByNameFragment = function (nameFragment) {
        return testService.getTestsByNameFragment(nameFragment).then(function (tests) {
            return tests;
        });
    };

    $ctrl.selectTest = function ($item, $model, $label, $event) {
        $ctrl.testsInput = "";
        $ctrl.selectedTest = $item;
    };

    $ctrl.save = function () {
        testTaskService.addTestTask($ctrl.employeeId, $ctrl.selectedTest.id).then(function (addedTestTask) {
            $ctrl.close();
        });
    };
}