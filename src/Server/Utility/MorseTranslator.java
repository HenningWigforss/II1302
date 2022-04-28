package Server.Utility;

/**
 * This class translate a string from plain text to morse code.
 */
public class MorseTranslator {
    private MorseAlphabet mAlphabet = new MorseAlphabet();

    private String translateChar(char letter) {
        letter = Character.toLowerCase(letter);

        // The alphabet contains (A-Ö, 0-9, ?!,.-()@/%"';:)
        String[][] alphabet = mAlphabet.getAlphabet();

        // Loop through the alphabet to find the letter, then return it's morse
        // translation.
        for (String[] i : alphabet) {
            if (i[0].charAt(0) == letter) {
                return i[1];
            }
        }
        return "";
    }

    /**
     * Translates a full string and returns the translation as a string.
     * 
     * @param message the string that should be translated.
     * @return morseMessage string.
     */
    public String translateString(String message) {
        String morseMessage = "";
        for (char i : message.toCharArray()) {
            morseMessage += translateChar(i);
        }
        return morseMessage;
    }

    /*public static void main(String[] args) {
        MorseTranslator morseTrans = new MorseTranslator();
        String message = "Arbeta Agilt";
        String morseMessage = morseTrans.translateString(message);
        System.out.println(message);
        System.out.println(morseMessage);
    }*/
}