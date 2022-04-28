package Server.Model;

import java.util.LinkedList;

import Server.DTO.ClientMessageDTO;
import Server.DTO.MessageDTO;

public class MessageHandler {
    private int nextId;
    private LinkedList messageList;

    public MessageHandler(){
        this.nextId = 0;
        this.messageList = new LinkedList<MessageDTO>();
    }
    public void addMessage(ClientMessageDTO cMessage){
        nextId++;
        messageList.add(new MessageDTO(cMessage, nextId));
    }

    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        ClientMessageDTO cMessage = new ClientMessageDTO("Arbeta Agilt", "Anders Sjögren");
        ClientMessageDTO cMessage2 = new ClientMessageDTO("Arbeta Agilt IDIOT", "Anders Sjögren");

        messageHandler.addMessage(cMessage);
        messageHandler.addMessage(cMessage2);

        MessageDTO mMmm = new MessageDTO(cMessage, 5);
        System.out.println(mMmm.getId());

        System.out.println(messageHandler.messageList.size());
        System.out.println(messageHandler.messageList.getFirst());
        //System.out.println(messageHandler.messageList.get(1).getId());
    }
}