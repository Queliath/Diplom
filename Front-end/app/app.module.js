import angular from 'angular';
import uirouter from 'angular-ui-router';
import uibootstrap from 'angular-ui-bootstrap';

import routing from './routing';

import {emProjectListComponent} from './em-project-list/em-project-list.component';
import {emProjectComponent} from './em-project/em-project.component';
import {emTestListComponent} from './em-test-list/em-test-list.component';
import {emTestComponent} from './em-test/em-test.component';
import {emQuestionComponent} from './em-question/em-question.component';

angular.module("app", [uirouter, uibootstrap])
    .config(routing)
    .component("emProjectList", emProjectListComponent)
    .component("emProject", emProjectComponent)
    .component("emTestList", emTestListComponent)
    .component("emTest", emTestComponent)
    .component("emQuestion", emQuestionComponent);