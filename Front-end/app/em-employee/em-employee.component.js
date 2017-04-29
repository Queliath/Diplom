export var emEmployeeComponent = {
    template: require('./em-employee.template.html'),
    controller: emEmployeeComponentController
};

function emEmployeeComponentController(employeeService, reportService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.employeeId = $stateParams.employeeId;
        employeeService.getEmployeeById($ctrl.employeeId).then(function (employee) {
            $ctrl.employee = employee;
        });
        reportService.getReportsByEmployeeId($ctrl.employeeId).then(function (reports) {
            $ctrl.reports = reports;
        });
    };
}