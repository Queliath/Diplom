export default function modalService($uibModal) {
    var service = this;

    service.openAddTestTaskModal = function () {
        return $uibModal.open({
            component: "emAddTestTaskModal"
        });
    };
}