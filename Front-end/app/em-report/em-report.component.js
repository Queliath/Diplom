export var emReportComponent = {
    template: require('./em-report.template.html'),
    controller: emReportComponentController
};

function emReportComponentController(reportService, testResultService, $stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.employeeId = $stateParams.employeeId;
        $ctrl.testPeriodId = $stateParams.testPeriodId;
        reportService.getReportByEmployeeIdAndTestPeriodId($ctrl.employeeId, $ctrl.testPeriodId).then(function (report) {
            $ctrl.report = report;
        });
        testResultService.getTestResultsByEmployeeIdAndTestPeriodId($ctrl.employeeId, $ctrl.testPeriodId).then(function (testResults) {
            $ctrl.testResults = testResults;
        });
    };
}