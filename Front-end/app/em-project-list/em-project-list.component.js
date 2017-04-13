export var emProjectListComponent = {
    template : require("./em-project-list.template.html"),
    controller : emProjectListComponentController
};

function emProjectListComponentController() {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.projects = [{
            "id": 1,
            "name": "Leffler Group",
            "startDate": "2010-10-13",
            "endDate": "2016-11-04",
            "employeeCount": 78,
            "projectManager": {
                "id": 1,
                "firstName": "Russell",
                "lastName": "Gardner"
            }
        }, {
            "id": 2,
            "name": "Ledner-Kub",
            "startDate": "2011-10-12",
            "endDate": "2016-06-04",
            "employeeCount": 99,
            "projectManager": {
                "id": 2,
                "firstName": "Rachel",
                "lastName": "Russell"
            }
        }, {
            "id": 3,
            "name": "West Inc",
            "startDate": "2011-08-17",
            "endDate": "2016-05-13",
            "employeeCount": 48,
            "projectManager": {
                "id": 3,
                "firstName": "Elizabeth",
                "lastName": "Murray"
            }
        }, {
            "id": 4,
            "name": "Hilll and Sons",
            "startDate": "2011-07-21",
            "endDate": "2016-12-29",
            "employeeCount": 91,
            "projectManager": {
                "id": 4,
                "firstName": "Aaron",
                "lastName": "Stanley"
            }
        }, {
            "id": 5,
            "name": "Kling, Schmitt and Moen",
            "startDate": "2010-07-27",
            "endDate": "2016-11-10",
            "employeeCount": 134,
            "projectManager": {
                "id": 5,
                "firstName": "Maria",
                "lastName": "Larson"
            }
        }];
    }
}