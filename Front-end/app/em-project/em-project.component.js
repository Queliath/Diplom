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
        $ctrl.employees = [{
            "id": 1,
            "firstName": "Doris",
            "lastName": "Evans",
            "birthDate": "1998-08-15",
            "position": "Librarian",
            "gender": "F",
            "experience": 7,
            "coreSkill": "Red"
        }, {
            "id": 2,
            "firstName": "Dorothy",
            "lastName": "Payne",
            "birthDate": "1972-03-08",
            "position": "Electrical Engineer",
            "gender": "F",
            "experience": 2,
            "coreSkill": "Purple"
        }, {
            "id": 3,
            "firstName": "Emily",
            "lastName": "Hayes",
            "birthDate": "1969-09-09",
            "position": "VP Marketing",
            "gender": "F",
            "experience": 4,
            "coreSkill": "Goldenrod"
        }, {
            "id": 4,
            "firstName": "Patricia",
            "lastName": "Brooks",
            "birthDate": "1983-05-05",
            "position": "Office Assistant II",
            "gender": "F",
            "experience": 4,
            "coreSkill": "Violet"
        }, {
            "id": 5,
            "firstName": "Arthur",
            "lastName": "Roberts",
            "birthDate": "1998-02-04",
            "position": "Technical Writer",
            "gender": "M",
            "experience": 2,
            "coreSkill": "Mauv"
        }, {
            "id": 6,
            "firstName": "Fred",
            "lastName": "Hayes",
            "birthDate": "1991-10-23",
            "position": "Speech Pathologist",
            "gender": "M",
            "experience": 2,
            "coreSkill": "Red"
        }, {
            "id": 7,
            "firstName": "Bonnie",
            "lastName": "Mccoy",
            "birthDate": "1993-04-04",
            "position": "Account Representative IV",
            "gender": "F",
            "experience": 4,
            "coreSkill": "Indigo"
        }, {
            "id": 8,
            "firstName": "Jimmy",
            "lastName": "Mccoy",
            "birthDate": "1981-09-10",
            "position": "Account Executive",
            "gender": "M",
            "experience": 5,
            "coreSkill": "Indigo"
        }, {
            "id": 9,
            "firstName": "Ralph",
            "lastName": "Rivera",
            "birthDate": "1997-02-07",
            "position": "Research Associate",
            "gender": "M",
            "experience": 6,
            "coreSkill": "Pink"
        }, {
            "id": 10,
            "firstName": "Eric",
            "lastName": "Morris",
            "birthDate": "1992-01-18",
            "position": "Media Manager IV",
            "gender": "M",
            "experience": 5,
            "coreSkill": "Crimson"
        }]
    };
}