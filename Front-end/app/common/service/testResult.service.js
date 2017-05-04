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

    service.sendTestAnswers = function (employeeId, testPeriodId, testId, answers) {
        return $http({
            method: "POST",
            url: EM_REST_SERVER_URI + "/employees/" + employeeId + "/reports/" + testPeriodId + "/results",
            data: {
                testId: testId,
                answers: answers
            }
        }).then(function (response) {
            return response.data;
        });
    };
}