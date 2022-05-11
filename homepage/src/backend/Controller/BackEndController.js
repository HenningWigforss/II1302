export class BackEndController {
    messageHandler;
    messageChecker;

    BackEndController(handler) {
        this.messageHandler = handler.getMessageHandler();
        this.messageChecker = handler.getMessageCheck();
    }

    /**
     * Lets the Message Handler know the message is read.
     */
    messageIsRead() {
        messageHandler.removeRead();
    }

    /**
     * Adds message to messageHandler
     * 
     * @param msg clientMessageDTO from clientHandler.
     */
    addMessage(msg) {
        messageHandler.addMessage(msg);
    }

    /**
     * Fetches the command message from messageHandler.
     * 
     * @param cmd String representation
     */
    fetchCommandMessage(cmd) {
        return messageHandler.fetchCommandMessage(cmd);
    }

    /**
     * Fetches the message list
     * 
     * @return messageList containing messageDTO
     */
    fetchMessageList() {
        return messageHandler.fetchMessageList();
    }

    /**
     * Gets the number of messages in queue
     * 
     * @return int queu size.
     */
    getMessageInQueue() {
        return messageHandler.getMessageInQueue();
    }

    /**
     * Gest the first message from message handler.
     * 
     * @return MessageDTO
     */
    getFirstMessage() {
        return messageHandler.getFirstMessage();
    }
    /**
     * Method to verify message
     * @param text String containing the text.
     * @return Boolean true or false.
     */
    checkMessage(text){
        return messageChecker.verifyMessage(text);
    }
}