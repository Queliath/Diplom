export default function testResultService($http) {
    var service = this;

    service.getTestResultsByEmployeeIdAndTestPeriodId = function (employeeId, testPeriodId) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/employees/" + employeeId + "/reports/" + testPeriodId + "/results"
        }).then(function (response) {
            return response.data;
        });
    };
}