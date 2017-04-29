export default function questionService($http) {
    var service = this;

    service.getQuestionsByTestId = function (testId) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/tests/" + testId + "/questions"
        }).then(function (response) {
            return response.data;
        });
    };

    service.getQuestionById = function (id) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/tests/0/questions/" + id
        }).then(function (response) {
            return response.data;
        });
    };
}