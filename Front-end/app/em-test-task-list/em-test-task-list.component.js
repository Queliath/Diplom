export var emTestTaskListComponent = {
    template: require("./em-test-task-list.template.html"),
    controller: emTestTaskListComponentController
};

function emTestTaskListComponentController(testTaskService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.employeeId = $stateParams.employeeId;
        testTaskService.getTestTasksByEmployeeId($ctrl.employeeId).then(function (testTasks) {
            $ctrl.testTasks = testTasks;
        });
    };
}