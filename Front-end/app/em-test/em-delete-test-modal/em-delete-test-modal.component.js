export var emDeleteTestModalComponent = {
    template: require('./em-delete-test-modal.template.html'),
    controller: emDeleteTestModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emDeleteTestModalComponentController(testService) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.testId = $ctrl.resolve.testId;
    };

    $ctrl.deleteTest = function () {
        testService.deleteTest($ctrl.testId).then(function () {
            $ctrl.close();
        });
    };
}