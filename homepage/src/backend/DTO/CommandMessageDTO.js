/**
 * The CommandMessage class represents the command message a
 * Data Transfer Object.
 */

class CommandMessageDTO {
    command;
    numberInQueue;
    plainText;
    morseText;

    /**
     * Creates a new instance of the class CommandMessage.
     * 
     * @param cmd           containing the command from BackEnd.
     * @param numberInQueue containing the number of message in queue.
     * @param MessageDTO    object of type MessageDTO containing message
     *                      information.
     */
    CommandMessageDTO(cmd, numberInQueue, msgDTO) {
        this.command = cmd;
        this.numberInQueue = numberInQueue;
        this.plainText = msgDTO.getPlainText();
        this.morseText = msgDTO.getMorseText();
    }

    getCommand() {
        return this.command;
    }

    getNumberInQueue() {
        return this.numberInQueue;
    }

    getPlainText() {
        return this.plainText;
    }

    getMorseText() {
        return this.morseText;
    }

    setCommand(cmd) {
        this.command = cmd;
    }

    setNumberInQueue(number) {
        this.numberInQueue = number;
    }

    setPlainText(text) {
        this.plainText = text;
    }

    setMorseText(morse) {
        this.morseText = morse;
    }

}