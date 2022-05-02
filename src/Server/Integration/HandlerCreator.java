package Server.Integration;

import Server.Model.MessageHandler;

public class HandlerCreator {
    ClientHandler clientHandler;
    MorseMateHandler morseMateHandler;
    MessageHandler messageHandler;

    public HandlerCreator(){
        this.clientHandler = new ClientHandler();
        this.messageHandler = new MessageHandler();
        this.morseMateHandler = new MorseMateHandler();
    }

    public ClientHandler getClientHandler(){
        return this.clientHandler;
    }

    public MorseMateHandler getMorseMateHandler(){
        return this.morseMateHandler;
    }

    public MessageHandler getMessageHandler(){
        return  this.messageHandler;
    }
}
