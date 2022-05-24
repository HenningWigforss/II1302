import { morseAlphabet } from './MorseAlphabet'

/**
 * Checks if a message contains illegal characters.
 * 
 * @msg String containing the message that is going to be checked.
 * @return boolean, if it contains illegal characters then return false,
 *         otherwise true.
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

const testChar = (ch) => {
    var flag = false;
    morseAlphabet.forEach(i => {
        if (i[0].charAt(0) == ch.toLowerCase())
            flag = true;
    })
    return flag;
}

export default verifyMessage