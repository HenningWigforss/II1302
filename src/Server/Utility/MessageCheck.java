package Server.Utility;
/**
    Class that takes a string message from user and verifies that it does not contain illegal characters. 
    @param String Message to check
    @return boolean true if OK, false if NOT OK
*/
public class MessageCheck {
    MAlphabet alp = new MAlphabet();
    String alphabet[][]= alp.getAlphabet();

    public boolean verifyMessage(String msg){
        msg.toLowerCase();

        for(char ch : msg.toCharArray()){
            if(!testChar(ch)) return false;
        }
        return true;
    }

    private boolean testChar(char ch){
        for(String[] i : alphabet){
            if(i[0].charAt(0) == ch) return true;
        }
        return false;
    }


    public static void main(String[] args){
        String str = "Hej detta är ett morsemeddelande";
        MessageCheck msgCheck = new MessageCheck();
        boolean check = msgCheck.verifyMessage(str);
        System.out.println(check);
    }
}
