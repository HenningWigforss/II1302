package Server.View;

import java.util.LinkedList;

import Server.Controller.ServerController;
import Server.DTO.MessageDTO;

public class ClientHandler {
    ServerController controller;

    /**
     * Listen to the client side for incomming messages and do appropriate commands.
     */
    public void ClientHandler(ServerController c) {
        this.controller = c;
        this.clientListener();
    }

    private void clientListener() {

    }

    private LinkedList<MessageDTO> fetchMessageQueue() {
        return controller.fetchMessageList();
    }

    private int getQueuSize() {
        return controller.getMessageInQueue();
    }

    private String[] getUserList() {
        LinkedList<MessageDTO> list = fetchMessageQueue();
        String[] userList = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            userList[i] = list.get(i).getUserName();
        }
        return userList;
    }

    private MessageDTO getFirstMessage() {
        return controller.getFirstMessage();

    }

}
