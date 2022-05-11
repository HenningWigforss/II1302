package BackEnd.Integration;
import BackEnd.Controller.BackEndController;

import BackEnd.DTO.ClientMessageDTO;
import BackEnd.DTO.CommandMessageDTO;
import BackEnd.Model.MessageHandler;

public class MorseMateHandler {
    BackEndController controller;

    public MorseMateHandler(BackEndController c){
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
        BackEndController sc = new BackEndController(hc);
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