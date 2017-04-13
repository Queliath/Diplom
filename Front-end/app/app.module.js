import angular from 'angular';
import uirouter from 'angular-ui-router';
import uibootstrap from 'angular-ui-bootstrap';

import routing from './routing';

import {emProjectListComponent} from './em-project-list/em-project-list.component';

angular.module("app", [uirouter, uibootstrap])
    .config(routing)
    .component("emProjectList", emProjectListComponent);