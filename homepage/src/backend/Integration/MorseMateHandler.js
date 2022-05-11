export class MorseMateHandler {
    controller;

    MorseMateHandler(c){
        this.controller = c;
    }

    morseMateListener(){
        
    }

    removeRead(){
        controller.messageIsRead();
    }

    fetchMessage(){
        cmdMessage = controller.fetchCommandMessage("Default");
        morseCMD = cmdMessage.getCommand() + '|' + cmdMessage.getNumberInQueue() + '|' + cmdMessage.getMorseText();

        return morseCMD;
    }

    /*
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
    }*/
}