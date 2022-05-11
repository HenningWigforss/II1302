package BackEnd.Model;

import java.util.LinkedList;

import BackEnd.DTO.ClientMessageDTO;
import BackEnd.DTO.CommandMessageDTO;
import BackEnd.DTO.MessageDTO;
import BackEnd.Utility.MorseTranslator;

/**
 * Class that handles all messages from the client.
 */
public class MessageHandler {
    private int nextId;
    private LinkedList<MessageDTO> messageList;
    private MorseTranslator morseTranslator;

    // Create a new instance of the message handler.
    public MessageHandler() {
        this.nextId = 0;
        this.messageList = new LinkedList<MessageDTO>();
        this.morseTranslator = new MorseTranslator();
    }

    /**
     * Adds a new message to the message list.
     * 
     * @param cMessage a ClientMessageDTO created by the client handler.
     */
    public void addMessage(ClientMessageDTO cMessage) {
        nextId++;
        MessageDTO newMessage = new MessageDTO(cMessage, nextId);
        String morse = morseTranslator.translateString(newMessage.getPlainText());
        newMessage.setMorseText(morse);
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
     * Gets the first message from list
     * @return MessageDTO
     */
    public MessageDTO getFirstMessage(){
        return messageList.getFirst();
    }

    /**
     * Lets the Message handler know that the message has been read and deletes the
     * first message in queue.
     */
    public void removeRead() {
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
    public LinkedList<MessageDTO> fetchMessageList() {
        return this.messageList;
    }
    /**
     * Updates real time date base.
     */
    public void updateRTDB(){
        return ;
    }
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        ClientMessageDTO cMessage = new ClientMessageDTO("Arbeta Agilt", "Anders Sjögren");
        ClientMessageDTO cMessage2 = new ClientMessageDTO("Arbeta Agilt IDIOT", "Anders Sjögren");

        messageHandler.addMessage(cMessage);
        messageHandler.addMessage(cMessage2);

        System.out.println(messageHandler.getMessageInQueue());

        LinkedList<MessageDTO> msgList = new LinkedList<>();

        msgList = messageHandler.fetchMessageList();

        System.out.println(msgList.getFirst().getPlainText());


    }
}
