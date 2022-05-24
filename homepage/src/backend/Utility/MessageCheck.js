import { morseAlphabet } from './MorseAlphabet'

/**
 * Checks if a message is empty, contains illegal characters or is too long. 
 * Also checks if the username is empty or too long.
 * Will return a string to be displayed by the view if an error occurs.
 */
export const verifyMessage = (msg, username) => {
    var error = 0;
    if (username == '') {
        return "You have to enter a username. Try again.";
    }

    else if (username.length > 20) {
        return "Username is longer than 20 symbols. Try again with a shorter username."
    }

    else if (msg == '') {
        return "You have to enter a message. Try again."
    }

    else if (msg.length > 200) {
        return "Message is longer than the maximum size. You can't send messages longer than 200 symbols."
    }

    Array.from(msg).forEach((ch) => {
        if (!testChar(ch)) {
            error = "Message was invalid, you used the char " + ch + ". Try again with the included symbols"
        }
    })

    return error;
}

/**
 * Tests a single char and looks for it in the Morse Alphabet.
 */
const testChar = (ch) => {
    var flag = false;
    morseAlphabet.forEach(i => {
        if (i[0].charAt(0) == ch.toLowerCase())
            flag = true;
    })
    return flag;
}

export default verifyMessage