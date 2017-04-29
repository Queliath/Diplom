export default function reportService($http) {
    var service = this;

    service.getReportsByEmployeeId = function (employeeId) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/employees/" + employeeId + "/reports"
        }).then(function (response) {
            return response.data;
        });
    };

    service.getReportByEmployeeIdAndTestPeriodId = function (employeeId, testPeriodId) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/employees/" + employeeId + "/reports/" + testPeriodId
        }).then(function (response) {
            return response.data;
        });
    };
}