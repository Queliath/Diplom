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
}