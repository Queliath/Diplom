export default function testService($http) {
    var service = this;

    service.getTests = function () {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/tests"
        }).then(function (response) {
            return response.data;
        });
    };

    service.getTestById = function (id) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/tests/" + id
        }).then(function (response) {
            return response.data;
        });
    };

    service.getTestsByNameFragment = function (nameFragment) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/tests/?name=" + nameFragment
        }).then(function (response) {
            return response.data;
        });
    };
}