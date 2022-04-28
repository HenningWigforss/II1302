<<<<<<< Updated upstream
=======
package Server.Utility;

public class MorseTranslator {
    static String morseAlphabet(char letter) {
        if (Character.isAlphabetic(letter)) {
            letter = Character.toLowerCase(letter);
        }

        // The alphabet contains (A-Ö, 0-9, ?!,.-()@/%"';:)
        String[][] alphabet = {
                { "a", ".- " },
                { "b", "-... " },
                { "c", "-.-. " },
                { "d", "-.. " },
                { "e", ". " },
                { "f", "..-. " },
                { "g", "--. " },
                { "h", ".... " },
                { "i", ".. " },
                { "j", ".--- " },
                { "k", "-.- " },
                { "l", ".-.. " },
                { "m", "-- " },
                { "n", "-. " },
                { "o", "--- " },
                { "p", ".--. " },
                { "q", "--.- " },
                { "r", ".-. " },
                { "s", "... " },
                { "t", "- " },
                { "u", "..- " },
                { "v", "...- " },
                { "w", ".-- " },
                { "x", "-..- " },
                { "y", "-.-- " },
                { "z", "--.. " },
                { "å", ".--.- " },
                { "ä", ".-.- " },
                { "ö", "---. " },
                { "1", ".---- " },
                { "2", "..--- " },
                { "3", "...-- " },
                { "4", "....- " },
                { "5", "..... " },
                { "6", "-.... " },
                { "7", "--... " },
                { "8", "---.. " },
                { "9", "----. " },
                { "0", "----- " },
                { "?", "..--.. " },
                { "!", "..--. " },
                { ",", "--..-- " },
                { ".", ".-.-.- " },
                { "(", "-.--. " },
                { ")", "-.--.- " },
                { "@", ".--.-. " },
                { "/", "-..-. " },
                { "%", ".--.. " },
                { "\"", ".-..-. " },
                { "'", ".----. " },
                { ";", "-.-.-. " },
                { ":", "---... " },
                { " ", "," }
        };

        // Loop through the alphabet to find the letter, then return it's morse
        // translation.
        for (String[] i : alphabet) {
            if (i[0].charAt(0) == letter) {
                return i[1];
            }
        }

        return "";
    }

    // Translates a full string and returns the translation as a string.
    static String translateMorse(String message) {
        String morseMessage = "";
        for (char i : message.toCharArray()) {
            morseMessage += morseAlphabet(i);
        }
        return morseMessage;
    }

    public static void main(String[] args) {
        String message = "Arbeta Agilt";
        String morseMessage = translateMorse(message);
        System.out.println(message);
        System.out.println(morseMessage);
    }
}
>>>>>>> Stashed changes
