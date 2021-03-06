export default function projectService($http) {
    var service = this;

    service.getProjects = function () {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/projects"
        }).then(function (response) {
            return response.data;
        });
    };

    service.getProjectById = function (id) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/projects/" + id
        }).then(function (response) {
            return response.data;
        });
    };
}