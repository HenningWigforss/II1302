/**
 * Class that handles all messages from the client.
 */
export class MessageHandler {
    nextId;
    messageList;
    morseTranslator;

    // Create a new instance of the message handler.
    MessageHandler() {
        this.nextId = 0
        this.messageList
        this.morseTranslator = new MorseTranslator();
    }

    /**
     * Adds a new message to the message list.
     * 
     * @param cMessage a ClientMessageDTO created by the client handler.
     */
    addMessage(cMessage) {
        nextId++;
        newMessage = new MessageDTO(cMessage, nextId);
        morse = morseTranslator.translateString(newMessage.getPlainText());
        newMessage.setMorseText(morse);
        this.messageList.add(newMessage);
    }

    /**
     * 
     * @param cmd the command that is going to be attached to the command message
     *            dto.
     * @return a commandMessageDTO with all the info needed.
     */
    fetchCommandMessage(cmd) {
        return new CommandMessageDTO(cmd, getMessageInQueue(), this.messageList.getFirst());
    }
    /**
     * Gets the first message from list
     * @return MessageDTO
     */
    getFirstMessage(){
        return messageList.getFirst();
    }

    /**
     * Lets the Message handler know that the message has been read and deletes the
     * first message in queue.
     */
    removeRead() {
        this.messageList.removeFirst();
    }

    /**
     * Method that returns the number of messages in the queue.
     * 
     * @return
     */
    getMessageInQueue() {
        return this.messageList.size();
    }

    /**
     * Method that returns the current message list.
     * 
     * @return messageList.
     */
    fetchMessageList() {
        return this.messageList;
    }
    /**
     * Updates real time date base.
     */
    updateRTDB(){
        return ;
    }

    /*static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        ClientMessageDTO cMessage = new ClientMessageDTO("Arbeta Agilt", "Anders Sjögren");
        ClientMessageDTO cMessage2 = new ClientMessageDTO("Arbeta Agilt IDIOT", "Anders Sjögren");

        messageHandler.addMessage(cMessage);
        messageHandler.addMessage(cMessage2);

        System.out.println(messageHandler.getMessageInQueue());

        LinkedList<MessageDTO> msgList = new LinkedList<>();

        msgList = messageHandler.fetchMessageList();

        System.out.println(msgList.getFirst().getPlainText());
    }*/
}
