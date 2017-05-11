import angular from 'angular';
import uirouter from 'angular-ui-router';
import uibootstrap from 'angular-ui-bootstrap';
import ngCookies from 'angular-cookies'

import routing from './routing';

import sessionService from './common/service/session.service';
import projectService from './common/service/project.service';
import employeeService from './common/service/employee.service';
import reportService from './common/service/report.service';
import testResultService from './common/service/testResult.service';
import testService from './common/service/test.service';
import questionService from './common/service/question.service';
import answerOptionService from './common/service/answerOptionService';
import testTaskService from './common/service/testTask.service';
import modalService from './common/service/modal.service';

import {emIndexComponent} from './em-index/em-index.component';
import {emLoginComponent} from './em-login/em-login.component';
import {emProjectListComponent} from './em-project-list/em-project-list.component';
import {emProjectComponent} from './em-project/em-project.component';
import {emEmployeeComponent} from './em-employee/em-employee.component';
import {emReportComponent} from './em-report/em-report.component';
import {emTestListComponent} from './em-test-list/em-test-list.component';
import {emTestComponent} from './em-test/em-test.component';
import {emPassTestComponent} from './em-pass-test/em-pass-test.component'
import {emQuestionComponent} from './em-question/em-question.component';
import {emTestTaskListComponent} from './em-test-task-list/em-test-task-list.component';
import {emAddTestTaskModalComponent} from './em-test-task-list/em-add-test-task-modal/em-add-test-task-modal.component';
import {emDeleteTestTaskModalComponent} from './em-test-task-list/em-delete-test-task-modal/em-delete-test-task-modal.component';
import {emTestResultModalComponent} from './em-pass-test/em-test-result-modal/em-test-result-modal.component';
import {emAddTestModalComponent} from './em-test-list/em-add-test-modal/em-add-test-modal.component';
import {emEditTestModalComponent} from './em-test/em-edit-test-modal/em-edit-test-modal.component';
import {emDeleteTestModalComponent} from './em-test/em-delete-test-modal/em-delete-test-modal.component';

angular.module("app", [uirouter, uibootstrap, ngCookies])
    .config(routing)
    .service("sessionService", sessionService)
    .service("projectService", projectService)
    .service("employeeService", employeeService)
    .service("reportService", reportService)
    .service("testResultService", testResultService)
    .service("testService", testService)
    .service("questionService", questionService)
    .service("answerOptionService", answerOptionService)
    .service("testTaskService", testTaskService)
    .service("modalService", modalService)
    .component("emIndex", emIndexComponent)
    .component("emLogin", emLoginComponent)
    .component("emProjectList", emProjectListComponent)
    .component("emProject", emProjectComponent)
    .component("emEmployee", emEmployeeComponent)
    .component("emReport", emReportComponent)
    .component("emTestList", emTestListComponent)
    .component("emTest", emTestComponent)
    .component("emPassTest", emPassTestComponent)
    .component("emQuestion", emQuestionComponent)
    .component("emTestTaskList", emTestTaskListComponent)
    .component("emAddTestTaskModal", emAddTestTaskModalComponent)
    .component("emDeleteTestTaskModal", emDeleteTestTaskModalComponent)
    .component("emTestResultModal", emTestResultModalComponent)
    .component("emAddTestModal", emAddTestModalComponent)
    .component("emEditTestModal", emEditTestModalComponent)
    .component("emDeleteTestModal", emDeleteTestModalComponent);