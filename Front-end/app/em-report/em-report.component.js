export var emReportComponent = {
    template: require('./em-report.template.html'),
    controller: emReportComponentController
};

function emReportComponentController($stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.employeeId = $stateParams.employeeId;
        $ctrl.reportDate = $stateParams.reportDate;
        $ctrl.report = {
            "date": $ctrl.reportDate,
            "testCount": 12,
            "averageSuccess": 13,
            "tests": [{
                "name": "Triple-buffered actuating benchmark",
                "success": 63
            }, {
                "name": "Enhanced fresh-thinking task-force",
                "success": 48
            }, {
                "name": "Cross-group contextually-based benchmark",
                "success": 75
            }, {
                "name": "Diverse stable functionalities",
                "success": 43
            }, {
                "name": "Persistent bi-directional flexibility",
                "success": 71
            }, {
                "name": "Upgradable asymmetric utilisation",
                "success": 57
            }, {
                "name": "Managed fault-tolerant neural-net",
                "success": 86
            }, {
                "name": "User-centric motivating task-force",
                "success": 14
            }]
        };
    }
}