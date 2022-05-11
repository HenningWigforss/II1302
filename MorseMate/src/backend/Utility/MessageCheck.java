package BackEnd.Utility;

/**
 * Class that takes a string message from user and verifies that it does not
 * contain illegal characters.
 * 
 * @param String Message to check
 * @return boolean true if OK, false if NOT OK
 */
public class MessageCheck {
    MorseAlphabet alp = new MorseAlphabet();
    String alphabet[][] = alp.getAlphabet();

    /**
     * Checks if a message contains illegal characters.
     * 
     * @msg String containing the message that is going to be checked.
     * @return boolean, if it contains illegal characters then return false,
     *         otherwise true.
     */
    public boolean verifyMessage(String msg) {

        for (char ch : msg.toCharArray()) {
            if (!testChar(ch)) {
                return false;
            }
        }
        return true;

    }

    private boolean testChar(char ch) {
        for (String[] i : alphabet) {
            if (i[0].charAt(0) == Character.toLowerCase(ch))
                return true;
        }
        return false;
    }

    /*public static void main(String[] args) {
        String str = "false";
        MessageCheck msgCheck = new MessageCheck();
        boolean check = msgCheck.verifyMessage(str);
        System.out.println(check);
    }*/
}
