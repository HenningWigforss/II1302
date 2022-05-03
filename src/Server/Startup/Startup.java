package Server.Startup;
import Server.Controller.ServerController;
import Server.Integration.HandlerCreator;
import Server.Integration.MorseMateHandler;
import Server.View.ClientView;

public class Startup{
        public static void main(String[] args){
            HandlerCreator hc = new HandlerCreator();
            ServerController sc = new ServerController(hc);
            MorseMateHandler mm = new MorseMateHandler(sc);
            ClientView cv = new ClientView(sc);
            boolean bool;

            if(cv.addMessage("ARBETA JÄVLIGT AGILT", "Anders Sjögren")){
                System.out.println("Message created");
            }else{
                System.out.println("Message invalid");
            }
            if(cv.addMessage("ARBETA HEJ AGILT", "Anders Sjögren")){
                System.out.println("Message created");
            }else{
                System.out.println("Message invalid");
            }

            if(cv.addMessage("ARB___ETA JÄVLIGT AGILT", "Anders Sjögren")){
                System.out.println("Message created");
            }else{
                System.out.println("Message invalid");
            }
            
            String testString = mm.fetchMessage();
            System.out.println(testString);
            mm.removeRead();
            testString = mm.fetchMessage();
            System.out.println(testString);

        }
    }
