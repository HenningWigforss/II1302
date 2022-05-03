package Server.View;

import java.util.LinkedList;

import javax.print.event.PrintServiceAttributeEvent;

import Server.Controller.ServerController;
import Server.DTO.ClientMessageDTO;
import Server.DTO.MessageDTO;

public class ClientView {
    ServerController controller;

    /**
     * Constructor for theClienthandler class.
     * @param c ServerController.
     */
    public ClientView(ServerController c) {
        this.controller = c;
        this.clientListener();
    }
    /**
     * Listen to the client side for incomming messages and do appropriate commands.
     */
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

    public MessageDTO getFirstMessage() {
        return controller.getFirstMessage();

    }

    public boolean addMessage(String msg, String user){
        if(!controller.checkMessage(msg)){
            return false;
        }
        ClientMessageDTO clientMsg = new ClientMessageDTO(msg, user);
        controller.addMessage(clientMsg);
        return true;
    }
}
