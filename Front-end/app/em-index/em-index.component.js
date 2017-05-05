export var emIndexComponent = {
    template: require("./em-index.template.html"),
    controller: emIndexComponentController
};

function emIndexComponentController($rootScope, $cookies, $state) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $rootScope.sessionEmployeeId = $cookies.get("sessionEmployeeId");
        $rootScope.sessionRole = $cookies.get("sessionRole");

        $ctrl.root = $rootScope;
    };

    $ctrl.logout = function () {
        $rootScope.sessionEmployeeId = undefined;
        $rootScope.sessionRole = undefined;
        $cookies.put("sessionEmployeeId", undefined);
        $cookies.put("sessionRole", undefined);

        $state.go("login");
    };
}