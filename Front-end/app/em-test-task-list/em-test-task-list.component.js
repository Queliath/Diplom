export var emTestTaskListComponent = {
    template: require("./em-test-task-list.template.html"),
    controller: emTestTaskListComponentController
};

function emTestTaskListComponentController($rootScope, testTaskService, $stateParams, modalService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.root = $rootScope;
        $ctrl.employeeId = $stateParams.employeeId;
        loadTestTasks();
    };

    $ctrl.openAddTestTaskModal = function () {
        modalService.openAddTestTaskModal().result.then(function () {
            loadTestTasks();
        });
    };

    function loadTestTasks() {
        testTaskService.getTestTasksByEmployeeId($ctrl.employeeId).then(function (testTasks) {
            $ctrl.testTasks = testTasks;
        });
    }
}