export var emProjectListComponent = {
    template : require("./em-project-list.template.html"),
    controller : emProjectListComponentController
};

function emProjectListComponentController(projectService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        projectService.getProjects().then(function (projects) {
            $ctrl.projects = projects;
        });
    };
}