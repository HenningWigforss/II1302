package BackEnd.Controller;

import java.util.LinkedList;

import BackEnd.DTO.ClientMessageDTO;
import BackEnd.DTO.CommandMessageDTO;
import BackEnd.DTO.MessageDTO;
import BackEnd.Integration.HandlerCreator;
import BackEnd.Model.MessageHandler;
import BackEnd.Utility.MessageCheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;

@RestController
public class BackEndController {
    MessageHandler messageHandler;
    MessageCheck messageChecker;

    @GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

    public BackEndController(HandlerCreator handler) {
        this.messageHandler = handler.getMessageHandler();
        this.messageChecker = handler.getMessageCheck();
    }

    /**
     * Lets the Message Handler know the message is read.
     */
    public void messageIsRead() {
        messageHandler.removeRead();
    }

    /**
     * Adds message to messageHandler
     * 
     * @param msg clientMessageDTO from clientHandler.
     */
    public void addMessage(ClientMessageDTO msg) {
        messageHandler.addMessage(msg);
    }

    /**
     * Fetches the command message from messageHandler.
     * 
     * @param cmd String representation
     */
    public CommandMessageDTO fetchCommandMessage(String cmd) {
        return messageHandler.fetchCommandMessage(cmd);
    }

    /**
     * Fetches the message list
     * 
     * @return messageList containing messageDTO
     */
    public LinkedList<MessageDTO> fetchMessageList() {
        return messageHandler.fetchMessageList();
    }

    /**
     * Gets the nuumber of messages in queue
     * 
     * @return int queu size.
     */
    public int getMessageInQueue() {
        return messageHandler.getMessageInQueue();
    }

    /**
     * Gest the first message from message handler.
     * 
     * @return MessageDTO
     */
    public MessageDTO getFirstMessage() {
        return messageHandler.getFirstMessage();
    }
    /**
     * Method to verify message
     * @param text String containing the text.
     * @return Boolean true or false.
     */
    public boolean checkMessage(String text){
        return messageChecker.verifyMessage(text);
    }
}