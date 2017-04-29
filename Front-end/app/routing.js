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

    var employeeState = {
        name: "employee",
        url: "/employee/{employeeId}",
        component: "emEmployee"
    };

    var reportState = {
        name: "report",
        url: "/employee/{employeeId}/report/{reportDate}",
        component: "emReport"
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

    var passTestState = {
        name: "passTest",
        url: "/test/{testId}/pass",
        component: "emPassTest"
    };

    var questionState = {
        name: "question",
        url: "/question/{questionId}",
        component: "emQuestion"
    };

    $stateProvider.state(projectsState);
    $stateProvider.state(projectState);
    $stateProvider.state(employeeState);
    $stateProvider.state(reportState);
    $stateProvider.state(testsState);
    $stateProvider.state(testState);
    $stateProvider.state(passTestState);
    $stateProvider.state(questionState);
}