export var emEmployeeComponent = {
    template: require('./em-employee.template.html'),
    controller: emEmployeeComponentController
};

function emEmployeeComponentController($stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.employeeId = $stateParams.employeeId;
        $ctrl.employee = {
            "id": $ctrl.employeeId,
            "firstName": "Doris",
            "lastName": "Evans",
            "birthDate": "1998-08-15",
            "position": "Senior Software Engineer",
            "experience": 7,
            "coreSkill": "Java"
        };
        $ctrl.reports = [{
            "date": "2016-12-14",
            "testCount": 12,
            "averageSuccess": 13
        }, {
            "date": "2017-04-05",
            "testCount": 11,
            "averageSuccess": 56
        }, {
            "date": "2017-03-01",
            "testCount": 10,
            "averageSuccess": 27
        }, {
            "date": "2017-03-07",
            "testCount": 10,
            "averageSuccess": 36
        }, {
            "date": "2016-05-18",
            "testCount": 7,
            "averageSuccess": 64
        }];
    }
}