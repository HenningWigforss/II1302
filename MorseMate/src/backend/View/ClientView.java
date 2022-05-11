package BackEnd.View;

import java.util.LinkedList;

import javax.print.event.PrintServiceAttributeEvent;

import BackEnd.Controller.BackEndController;
import BackEnd.DTO.ClientMessageDTO;
import BackEnd.DTO.MessageDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;

@RestController
public class ClientView {
    BackEndController controller;

    /**
     * Constructor for theClienthandler class.
     * @param c BackEndController.
     */
    public ClientView(BackEndController c) {
        this.controller = c;
        this.clientListener();
    }

    @GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
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
