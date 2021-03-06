package BackEnd.Integration;

import BackEnd.Model.MessageHandler;
import BackEnd.Utility.MessageCheck;

import org.springframework.context.annotation.Bean;
/**
 * Utility class setting up all handlers.
 */
public class HandlerCreator {

    MessageHandler messageHandler;
    MessageCheck check;
    /**
     * Constructor for the handlerCreator class.
     */
    public HandlerCreator(){
        this.messageHandler = new MessageHandler();
        this.check = new MessageCheck();
    }

    public MessageHandler getMessageHandler(){
        return  this.messageHandler;
    }

    public MessageCheck getMessageCheck(){
        return this.check;
    }
}