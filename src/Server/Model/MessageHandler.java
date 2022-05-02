package Server.Model;

import java.util.LinkedList;

import Server.DTO.ClientMessageDTO;
import Server.DTO.CommandMessageDTO;
import Server.DTO.MessageDTO;

/**
 * Class that handles all messages from the client.
 */
public class MessageHandler {
    private int nextId;
    private LinkedList<MessageDTO> messageList;

    // Create a new instance of the message handler.
    public MessageHandler() {
        this.nextId = 0;
        this.messageList = new LinkedList<MessageDTO>();
    }

    /**
     * Adds a new message to the message list.
     * 
     * @param cMessage a ClientMessageDTO created by the client handler.
     */
    public void addMessage(ClientMessageDTO cMessage) {
        nextId++;
        MessageDTO newMessage = new MessageDTO(cMessage, nextId);
        this.messageList.add(newMessage);
    }

    /**
     * 
     * @param cmd the command that is going to be attached to the command message
     *            dto.
     * @return a commandMessageDTO with all the info needed.
     */
    public CommandMessageDTO fetchCommandMessage(String cmd) {
        return new CommandMessageDTO(cmd, getMessageInQueue(), this.messageList.getFirst());
    }

    /**
     * Lets the Message handler know that the message has been read and deletes the
     * first message in queue.
     */
    public void messageRead() {
        this.messageList.removeFirst();
    }

    /**
     * Method that returns the number of messages in the queue.
     * 
     * @return
     */
    public int getMessageInQueue() {
        return this.messageList.size();
    }

    /**
     * Method that returns the current message list.
     * 
     * @return messageList.
     */
    public LinkedList<MessageDTO> getMessageList() {
        return this.messageList;
    }

    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        ClientMessageDTO cMessage = new ClientMessageDTO("Arbeta Agilt", "Anders Sjögren");
        ClientMessageDTO cMessage2 = new ClientMessageDTO("Arbeta Agilt IDIOT", "Anders Sjögren");

        messageHandler.addMessage(cMessage);
        messageHandler.addMessage(cMessage2);

        System.out.println(messageHandler.getMessageInQueue());

    }
}
