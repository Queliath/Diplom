export var emEditTestModalComponent = {
    template: require("./em-edit-test-modal.template.html"),
    controller: emEditTestModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emEditTestModalComponentController(testService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.testId = $ctrl.resolve.testId;
        testService.getTestById($ctrl.testId).then(function (test) {
            $ctrl.test = test;
            $ctrl.fixedTimeInput = new Date(0, 0, 0, 0, $ctrl.test.fixedTime, 0, 0);
        });
    };

    $ctrl.save = function () {
        $ctrl.test.fixedTime = $ctrl.fixedTimeInput.getHours() * 60 + $ctrl.fixedTimeInput.getMinutes();
        testService.editTest($ctrl.test).then(function (test) {
            $ctrl.close();
        });
    };
}