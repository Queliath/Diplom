export default function testTaskService($http) {
    var service = this;

    service.getTestTasksByEmployeeId = function (employeeId) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/employees/" + employeeId + "/tasks"
        }).then(function (response) {
            return response.data;
        });
    };

    service.addTestTask = function (employeeId, testId) {
        return $http({
            method: "POST",
            url: EM_REST_SERVER_URI + "/employees/" + employeeId + "/tasks",
            data: {
                testId: testId
            }
        }).then(function (response) {
            return response.data;
        });
    };
}