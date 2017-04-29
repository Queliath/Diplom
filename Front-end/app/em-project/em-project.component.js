export var emProjectComponent = {
    template: require('./em-project.template.html'),
    controller: emProjectComponentController
};

function emProjectComponentController(projectService, employeeService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.projectId = $stateParams.projectId;
        projectService.getProjectById($ctrl.projectId).then(function (project) {
            $ctrl.project = project;
        });
        employeeService.getEmployeesByProjectId($ctrl.projectId).then(function (employees) {
            $ctrl.employees = employees;
        });
    };
}