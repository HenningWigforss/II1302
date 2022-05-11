export class ClientView {
    controller;

    /**
     * Constructor for theClienthandler class.
     * @param c BackEndController.
     */
    ClientView(c) {
        this.controller = c;
        this.clientListener();
    }

    fetchMessageQueue() {
        return controller.fetchMessageList();
    }

    getQueuSize() {
        return controller.getMessageInQueue();
    }

    getUserList() {
        list = fetchMessageQueue();
        userList = new String[list.size()];

        for (let i = 0; i < list.size(); i++) {
            userList[i] = list.get(i).getUserName();
        }
        return userList;
    }

    getFirstMessage() {
        return controller.getFirstMessage();
    }

    addMessage(msg, user){
        if(!controller.checkMessage(msg)){
            return false;
        }
        clientMsg = new ClientMessageDTO(msg, user);
        controller.addMessage(clientMsg);
        return true;
    }
}