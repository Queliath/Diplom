export var emTestResultModalComponent = {
    template: require("./em-test-result-modal.template.html"),
    controller: emTestResultModalComponentController,
    bindings : {
        resolve: '<',
        close: '&',
        dismiss: '&'
    }
};

function emTestResultModalComponentController() {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.testResult = $ctrl.resolve.testResult;
    };
}