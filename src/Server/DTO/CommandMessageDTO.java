package Server.DTO;

/**
 * The CommandMessage class represents the command message a
 * Data Transfer Object.
 */

public class CommandMessage {
    private String command;
    private int numberInQueue;
    private String plainText;
    private String morseText;

    /**
     * Creates a new instance of the class CommandMessage.
     * 
     * @param cmd           String containing the command from server.
     * @param numberInQueue int containing the number of message in queue.
     * @param MessageDTO    object of type MessageDTO containing message
     *                      information.
     */
    public CommandMessage(String cmd, int numberInQueue, MessageDTO msgDTO) {
        this.command = cmd;
        this.numberInQueue = numberInQueue;
        this.plainText = msgDTO.getPlainText();
        this.morseText = msgDTO.getMorseText();
    }

    public String getCommand() {
        return this.command;
    }

    public int getNumberInQueue() {
        return this.numberInQueue;
    }

    public String getPlainText() {
        return this.plainText;
    }

    public String getMorseText() {
        return this.morseText;
    }

    public void setCommand(String cmd) {
        this.command = cmd;
    }

    public void setNumberInQueue(int number) {
        this.numberInQueue = number;
    }

    public void setPlainText(String text) {
        this.plainText = text;
    }

    public void setMorseText(String morse) {
        this.morseText = morse;
    }

}