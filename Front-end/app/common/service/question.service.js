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

    service.addQuestion = function (question) {
        return $http({
            method: "POST",
            url: EM_REST_SERVER_URI + "/tests/" + question.testId + "/questions",
            data: question
        }).then(function (response) {
            return response.data;
        });
    };

    service.editQuestion = function (question) {
        return $http({
            method: "PUT",
            url: EM_REST_SERVER_URI + "/tests/" + question.testId + "/questions/" + question.id,
            data: question
        }).then(function (response) {
            return response.data;
        });
    };

    service.deleteQuestion = function (id) {
        return $http({
            method: "DELETE",
            url: EM_REST_SERVER_URI + "/tests/0/questions/" + id
        });
    };
}