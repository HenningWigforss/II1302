package Server.Integration;
import Server.Controller.ServerController;

public class MorseMateHandler {
    ServerController controller;

    public MorseMateHandler(ServerController c){
        this.controller = c;
    }

    private void morseMateListener(){
        
    }

    private String fetchMessage(){
        CommandMessageDTO cmdMessage = controller.fetchCommandMessage();
        String morseCMD = cmdMessage.CMD + '|' + cmdMessage.numberInQueue + '|' + cmdMessage.morseText;

        return morseCMD;
    }
}