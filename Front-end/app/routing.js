export default function routing($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/");

    var welcomeState = {
        name: "welcome",
        url: "/",
        component: "emProjectList",
    };

    var projectState = {
        name: "project",
        url: "/project/{projectId}",
        component: "emProject"
    };

    $stateProvider.state(welcomeState);
    $stateProvider.state(projectState);
}