export var emTestComponent = {
    template: require('./em-test.template.html'),
    controller: emTestComponentController
};

function emTestComponentController($stateParams) {
    var $ctrl = this;

    $ctrl.$onInit = function () {
        $ctrl.testId = $stateParams.projectId;
        $ctrl.test = {
            "id": $ctrl.testId,
            "name": "Managed background approach",
            "questionsCount": 48,
            "fixedTime": 38
        };
        $ctrl.questions = [{
            "id": 1,
            "content": "Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.",
            "options": [
                {
                    "content": "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus.",
                    "value": 5
                },
                {
                    "content": "Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.",
                    "value": 2
                },
                {
                    "content": "Donec posuere metus vitae ipsum. Aliquam non mauris.",
                    "value": 1
                },
                {
                    "content": "Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit.",
                    "value": 3
                },
                {
                    "content": "Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.",
                    "value": 0
                },
                {
                    "content": "Duis at velit eu est congue elementum.",
                    "value": 4
                }
            ]
        }, {
            "id": 2,
            "content": "Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.",
            "options": [
                {
                    "content": "In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem.",
                    "value": 3
                },
                {
                    "content": "Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque.",
                    "value": 0
                },
                {
                    "content": "Vestibulum ac est lacinia nisi venenatis tristique.",
                    "value": 5
                },
                {
                    "content": "Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum.",
                    "value": 2
                },
                {
                    "content": "Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue.",
                    "value": 2
                },
                {
                    "content": "Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.",
                    "value": 5
                }
            ]
        }, {
            "id": 3,
            "content": "In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio.",
            "options": [
                {
                    "content": "Donec posuere metus vitae ipsum. Aliquam non mauris.",
                    "value": 2
                },
                {
                    "content": "Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros.",
                    "value": 0
                },
                {
                    "content": "Cras non velit nec nisi vulputate nonummy.",
                    "value": 2
                },
                {
                    "content": "Nulla justo. Aliquam quis turpis eget elit sodales scelerisque.",
                    "value": 1
                }
            ]
        }, {
            "id": 4,
            "content": "In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat. Nulla nisl. Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst.",
            "options": [
                {
                    "content": "Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque.",
                    "value": 0
                },
                {
                    "content": "Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.",
                    "value": 3
                },
                {
                    "content": "Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis.",
                    "value": 1
                }
            ]
        }, {
            "id": 5,
            "content": "Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros. Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.",
            "options": [
                {
                    "content": "Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc.",
                    "value": 4
                },
                {
                    "content": "In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo.",
                    "value": 4
                },
                {
                    "content": "Suspendisse ornare consequat lectus.",
                    "value": 2
                },
                {
                    "content": "Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.",
                    "value": 5
                },
                {
                    "content": "In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices.",
                    "value": 2
                },
                {
                    "content": "Aliquam quis turpis eget elit sodales scelerisque.",
                    "value": 0
                }
            ]
        }, {
            "id": 6,
            "content": "Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh.",
            "options": [
                {
                    "content": "Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.",
                    "value": 0
                },
                {
                    "content": "Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.",
                    "value": 4
                },
                {
                    "content": "Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.",
                    "value": 4
                }
            ]
        }, {
            "id": 7,
            "content": "In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum.",
            "options": [
                {
                    "content": "Duis bibendum. Morbi non quam nec dui luctus rutrum.",
                    "value": 0
                },
                {
                    "content": "Pellentesque at nulla. Suspendisse potenti.",
                    "value": 2
                },
                {
                    "content": "Etiam vel augue.",
                    "value": 2
                },
                {
                    "content": "Integer ac neque. Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.",
                    "value": 2
                },
                {
                    "content": "Pellentesque at nulla. Suspendisse potenti.",
                    "value": 2
                },
                {
                    "content": "Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.",
                    "value": 3
                }
            ]
        }, {
            "id": 8,
            "content": "Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.",
            "options": [
                {
                    "content": "Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla.",
                    "value": 5
                },
                {
                    "content": "Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor.",
                    "value": 4
                },
                {
                    "content": "Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.",
                    "value": 3
                }
            ]
        }, {
            "id": 9,
            "content": "Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis.",
            "options": [
                {
                    "content": "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor.",
                    "value": 0
                },
                {
                    "content": "Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula.",
                    "value": 5
                },
                {
                    "content": "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue.",
                    "value": 1
                }
            ]
        }, {
            "id": 10,
            "content": "Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo.",
            "options": [
                {
                    "content": "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante.",
                    "value": 4
                },
                {
                    "content": "Quisque porta volutpat erat.",
                    "value": 4
                },
                {
                    "content": "Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti.",
                    "value": 4
                }
            ]
        }];
    };
}