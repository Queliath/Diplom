export default function routing($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/");

    var welcomeState = {
        name: "welcome",
        url: "/",
        component: "emProjectList",
    };

    $stateProvider.state(welcomeState);
}