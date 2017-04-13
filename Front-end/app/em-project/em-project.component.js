export var emProjectComponent = {
    template: require('./em-project.template.html'),
    controller: emProjectComponentController
};

function emProjectComponentController($stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.projectId = $stateParams.projectId;
        $ctrl.project = {
            "id": $ctrl.projectId,
            "name": "Leffler Group",
            "startDate": "2010-10-13",
            "endDate": "2016-11-04",
            "employeeCount": 78,
            "projectManager": {
                "id": 1,
                "firstName": "Russell",
                "lastName": "Gardner"
            }
        };
    };
}