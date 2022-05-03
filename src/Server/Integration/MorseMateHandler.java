package Server.Integration;
import Server.Controller.ServerController;

import Server.DTO.ClientMessageDTO;
import Server.DTO.CommandMessageDTO;
import Server.Model.MessageHandler;

public class MorseMateHandler {
    ServerController controller;

    public MorseMateHandler(ServerController c){
        this.controller = c;
    }

    private void morseMateListener(){
        
    }

    public void removeRead(){
        controller.messageIsRead();
    }

    public String fetchMessage(){
        CommandMessageDTO cmdMessage = controller.fetchCommandMessage("Default");
        String morseCMD = cmdMessage.getCommand() + '|' + cmdMessage.getNumberInQueue() + '|' + cmdMessage.getMorseText();

        return morseCMD;
    }

    public static void main(String[] args){
        HandlerCreator hc = new HandlerCreator();
        ServerController sc = new ServerController(hc);
        MorseMateHandler mm = new MorseMateHandler(sc);
        ClientMessageDTO cMessage = new ClientMessageDTO("Arbeta Agilt", "Anders Sjögren");
        ClientMessageDTO cMessage2 = new ClientMessageDTO("Arbeta Agilt IDIOT", "Anders Sjögren");

        sc.addMessage(cMessage);
        sc.addMessage(cMessage2);

        String cmd = mm.fetchMessage();
        System.out.println(cmd);

        sc.messageIsRead();

        cmd = mm.fetchMessage();
        System.out.println(cmd);
    }
}