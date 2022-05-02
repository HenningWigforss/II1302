package Server.Integration;

import Server.Model.MessageHandler;

public class HandlerCreator {

    MessageHandler messageHandler;

    public HandlerCreator(){
        this.messageHandler = new MessageHandler();
    }

    public MessageHandler getMessageHandler(){
        return  this.messageHandler;
    }
}
