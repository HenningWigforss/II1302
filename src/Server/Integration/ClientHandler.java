package Server.Integration;

import java.util.LinkedList;

import Server.Controller.ServerController;
import Server.DTO.MessageDTO;

public class ClientHandler {
    ServerController controller;

    /**
     * Listen to the client side for incomming messages and do appropriate commands.
     */
    public void clientHandlerListener(ServerController c){
        this.controller = c;
    }
    
    private LinkedList<MessageDTO> fetchMessageQueue(){
        return controller.fetchMessageList();
    }

}
