export var emProjectComponent = {
    template: require('./em-project.template.html'),
    controller: emProjectComponentController
};

function emProjectComponentController($rootScope, projectService, employeeService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.root = $rootScope;
        $ctrl.projectId = $stateParams.projectId;
        projectService.getProjectById($ctrl.projectId).then(function (project) {
            $ctrl.project = project;
        });
        employeeService.getEmployeesByProjectId($ctrl.projectId).then(function (employees) {
            $ctrl.employees = employees;
        });
    };
}