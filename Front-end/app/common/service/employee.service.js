export default function employeeService($http) {
    var service = this;

    service.getEmployeesByProjectId = function (projectId) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/employees/?projectId=" + projectId
        }).then(function (response) {
            return response.data;
        });
    };

    service.getEmployeeById = function (id) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/employees/" + id
        }).then(function (response) {
            return response.data;
        });
    };
}