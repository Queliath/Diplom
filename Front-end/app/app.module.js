import angular from 'angular';
import uirouter from 'angular-ui-router';
import uibootstrap from 'angular-ui-bootstrap';

import routing from './routing';

import projectService from './common/service/project.service';
import employeeService from './common/service/employee.service';

import {emProjectListComponent} from './em-project-list/em-project-list.component';
import {emProjectComponent} from './em-project/em-project.component';
import {emEmployeeComponent} from './em-employee/em-employee.component';
import {emReportComponent} from './em-report/em-report.component';
import {emTestListComponent} from './em-test-list/em-test-list.component';
import {emTestComponent} from './em-test/em-test.component';
import {emPassTestComponent} from './em-pass-test/em-pass-test.component'
import {emQuestionComponent} from './em-question/em-question.component';

angular.module("app", [uirouter, uibootstrap])
    .config(routing)
    .service("projectService", projectService)
    .service("employeeService", employeeService)
    .component("emProjectList", emProjectListComponent)
    .component("emProject", emProjectComponent)
    .component("emEmployee", emEmployeeComponent)
    .component("emReport", emReportComponent)
    .component("emTestList", emTestListComponent)
    .component("emTest", emTestComponent)
    .component("emPassTest", emPassTestComponent)
    .component("emQuestion", emQuestionComponent);