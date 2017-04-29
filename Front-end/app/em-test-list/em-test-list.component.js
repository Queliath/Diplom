export var emTestListComponent = {
    template: require('./em-test-list.template.html'),
    controller: emTestListComponentController
};

function emTestListComponentController() {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.tests = [{
            "id": 1,
            "name": "Managed background approach",
            "questionsCount": 48,
            "fixedTime": 38
        }, {
            "id": 2,
            "name": "Focused context-sensitive open architecture",
            "questionsCount": 29,
            "fixedTime": 25
        }, {
            "id": 3,
            "name": "Pre-emptive well-modulated artificial intelligence",
            "questionsCount": 19,
            "fixedTime": 35
        }, {
            "id": 4,
            "name": "Reactive empowering internet solution",
            "questionsCount": 20,
            "fixedTime": 27
        }, {
            "id": 5,
            "name": "Versatile discrete encoding",
            "questionsCount": 15,
            "fixedTime": 16
        }, {
            "id": 6,
            "name": "Realigned 24/7 neural-net",
            "questionsCount": 21,
            "fixedTime": 22
        }, {
            "id": 7,
            "name": "Diverse next generation synergy",
            "questionsCount": 28,
            "fixedTime": 28
        }, {
            "id": 8,
            "name": "Exclusive client-driven matrix",
            "questionsCount": 13,
            "fixedTime": 44
        }, {
            "id": 9,
            "name": "Devolved transitional approach",
            "questionsCount": 22,
            "fixedTime": 33
        }, {
            "id": 10,
            "name": "De-engineered systemic adapter",
            "questionsCount": 43,
            "fixedTime": 47
        }];
    }
}