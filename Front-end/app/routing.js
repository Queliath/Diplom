export default function routing($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/projects");

    var projectsState = {
        name: "projects",
        url: "/projects",
        component: "emProjectList",
    };

    var projectState = {
        name: "project",
        url: "/projects/{projectId}",
        component: "emProject"
    };

    var testsState = {
        name: "tests",
        url: "/tests",
        component: "emTestList"
    };

    var testState = {
        name: "test",
        url: "/test/{testId}",
        component: "emTest"
    };

    var questionState = {
        name: "question",
        url: "/question/{questionId}",
        component: "emQuestion"
    };

    $stateProvider.state(projectsState);
    $stateProvider.state(projectState);
    $stateProvider.state(testsState);
    $stateProvider.state(testState);
    $stateProvider.state(questionState);
}