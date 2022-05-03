package Server.Integration;

import Server.Model.MessageHandler;
/**
 * Utility class setting up all handlers.
 */
public class HandlerCreator {

    MessageHandler messageHandler;
    /**
     * Constructor for the handlerCreator class.
     */
    public HandlerCreator(){
        this.messageHandler = new MessageHandler();
    }

    public MessageHandler getMessageHandler(){
        return  this.messageHandler;
    }
}
