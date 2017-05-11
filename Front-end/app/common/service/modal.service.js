export default function modalService($uibModal) {
    var service = this;

    service.openAddTestTaskModal = function () {
        return $uibModal.open({
            component: "emAddTestTaskModal"
        });
    };

    service.openDeleteTestTaskModal = function (testId) {
        return $uibModal.open({
            component: "emDeleteTestTaskModal",
            resolve: {
                testId: function () {
                    return testId;
                }
            }
        });
    };

    service.openTestResultModal = function (testResult) {
        return $uibModal.open({
            component: "emTestResultModal",
            resolve: {
                testResult: function () {
                    return testResult;
                }
            }
        });
    };

    service.openAddTestModal = function () {
        return $uibModal.open({
            component: "emAddTestModal"
        });
    };

    service.openEditTestModal = function (testId) {
        return $uibModal.open({
            component: "emEditTestModal",
            resolve: {
                testId: function () {
                    return testId;
                }
            }
        });
    };

    service.openDeleteTestModal = function (testId) {
        return $uibModal.open({
            component: "emDeleteTestModal",
            resolve: {
                testId: function () {
                    return testId;
                }
            }
        });
    };

    service.openAddQuestionModal = function () {
        return $uibModal.open({
            component: "emAddQuestionModal"
        });
    };
}