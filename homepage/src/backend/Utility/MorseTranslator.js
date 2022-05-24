import { morseAlphabet } from './MorseAlphabet'

/**
 * Translates a char to morse.
 */
const translateChar = (letter) => {
    var morseLetter;
    // Loop through the alphabet to find the letter, then return it's morse
    // translation.
    morseAlphabet.forEach(i => {
        if (i[0].charAt(0) == letter.toLowerCase()) {
            morseLetter = i[1];
        }
    })
    return morseLetter;
}

/**
 * Translates a full string and returns the translation as a string.
 */
export const translateString = (message) => {
    var morseMessage = "";
    Array.from(message).forEach(i => {
        morseMessage += translateChar(i);
    })

    //console.log("The message: \"" + message + "\" was translated to: \"" + morseMessage + "\".")

    return morseMessage;
}

export default translateString