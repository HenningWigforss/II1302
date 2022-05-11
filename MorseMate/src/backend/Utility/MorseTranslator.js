import {morseAlphabet} from './MorseAlphabet'

/**
 * This class translate a string from plain text to morse code.
 */
    const translateChar = (letter) => {
        var morseLetter;
        // Loop through the alphabet to find the letter, then return it's morse
        // translation.
        morseAlphabet.forEach (i => {
            if (i[0].charAt(0) == letter) {
                morseLetter = i[1];
            }
        })
        return morseLetter;
    }

    /**
     * Translates a full string and returns the translation as a string.
     * 
     * @param message the string that should be translated.
     * @return morseMessage string.
     */
    export const translateString = (message) => {
        var morseMessage = "";
        Array.from(message).forEach (i => {
            morseMessage += translateChar(i);
        })
        return morseMessage;
    }

    /*public static void main(String[] args) {
        MorseTranslator morseTrans = new MorseTranslator();
        String message = "Arbeta Agilt";
        String morseMessage = morseTrans.translateString(message);
        System.out.println(message);
        System.out.println(morseMessage);
    }*/