package BackEnd.DTO;

/**
 * The MessageDTO class represents the client message as a
 * Data Transfer Object for the BackEnds use.
 */

public class MessageDTO {
    private String plainText;
    private String morseText;
    private String userName;
    private int id;
    private boolean status;

    /**
     * Creates a new instance of the class MessageDTO.
     * 
     * @param msgDTO object of type ClientMessageDTO containing information about
     *               the message.
     * @param id     int containing the id for the message.
     */
    public MessageDTO(ClientMessageDTO msgDTO, int id) {
        this.userName = msgDTO.getUserName();
        this.plainText = msgDTO.getPlainText();
        this.morseText = null;
        this.id = id;
        this.status = false;
    }

    public String getPlainText() {
        return this.plainText;
    }

    public String getMorseText() {
        return this.morseText;
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getId() {
        return this.id;
    }

    public void setPlainText(String msg) {
        this.plainText = msg;
    }

    public void setMorseText(String msg) {
        this.morseText = msg;
    }

    public void setUserName(String user) {
        this.userName = user;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    public void setId(int id) {
        this.id = id;
    }

}