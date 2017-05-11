export var emAddTestModalComponent = {
    template: require("./em-add-test-modal.template.html"),
    controller: emAddTestModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emAddTestModalComponentController(testService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.fixedTimeInput = new Date(0, 0, 0, 0, 0, 0, 0);
    };

    $ctrl.save = function () {
        $ctrl.test.fixedTime = $ctrl.fixedTimeInput.getHours() * 60 + $ctrl.fixedTimeInput.getMinutes();
        testService.addTest($ctrl.test).then(function (addedTest) {
            $ctrl.close();
        });
    };
}