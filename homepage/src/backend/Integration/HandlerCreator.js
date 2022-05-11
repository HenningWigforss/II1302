/**
 * Utility class setting up all handlers.
 */
export class HandlerCreator {
    messageHandler;
    check;
    /**
     * Constructor for the handlerCreator class.
     */
    HandlerCreator(){
        this.messageHandler = new MessageHandler();
        this.check = new MessageCheck();
    }

    getMessageHandler(){
        return  this.messageHandler;
    }

    getMessageCheck(){
        return this.check;
    }
}