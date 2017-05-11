export var emDeleteTestTaskModalComponent = {
    template: require("./em-delete-test-task-modal.template.html"),
    controller: emDeleteTestTaskModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emDeleteTestTaskModalComponentController($stateParams, testTaskService) {
    var $ctrl = this;

    $ctrl.$onInit= function () {
        $ctrl.employeeId = $stateParams.employeeId;
        $ctrl.testId = $ctrl.resolve.testId;
    };

    $ctrl.deleteTestTask = function () {
        testTaskService.deleteTestTask($ctrl.employeeId, $ctrl.testId).then(function () {
            $ctrl.close();
        });
    };
}