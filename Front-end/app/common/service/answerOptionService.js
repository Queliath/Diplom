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
}