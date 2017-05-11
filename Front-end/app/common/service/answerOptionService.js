export default function answerOptionService($http) {
    var service = this;

    service.getAnswerOptionsByQuestionId = function (questionId) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/questions/" + questionId + "/options"
        }).then(function (response) {
            return response.data;
        });
    };

    service.getAnswerOptionById = function (id) {
        return $http({
            method: "GET",
            url: EM_REST_SERVER_URI + "/questions/0/options/" + id
        }).then(function (response) {
            return response.data;
        });
    };

    service.addAnswerOption = function (answerOption) {
        return $http({
            method: "POST",
            url: EM_REST_SERVER_URI + "/questions/" + answerOption.questionId + "/options",
            data: answerOption
        }).then(function (response) {
            return response.data;
        });
    };

    service.editAnswerOption = function (answerOption) {
        return $http({
            method: "PUT",
            url: EM_REST_SERVER_URI + "/questions/" + answerOption.questionId + "/options/" + answerOption.id,
            data: answerOption
        }).then(function (response) {
            return response.data;
        });
    };

    service.deleteAnswerOption = function (id) {
        return $http({
            method: "DELETE",
            url: EM_REST_SERVER_URI + "/questions/0/options/" + id
        });
    };
}