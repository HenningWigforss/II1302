/**
 * The MessageDTO class represents the client message as a
 * Data Transfer Object for the BackEnds use.
 */

class MessageDTO {
    plainText;
    morseText;
    userName;
    id;
    status;

    /**
     * Creates a new instance of the class MessageDTO.
     * 
     * @param msgDTO object of type ClientMessageDTO containing information about
     *               the message.
     * @param id     containing the id for the message.
     */
    MessageDTO(msgDTO, id) {
        this.userName = msgDTO.getUserName();
        this.plainText = msgDTO.getPlainText();
        this.morseText = null;
        this.id = id;
        this.status = false;
    }

    getPlainText() {
        return this.plainText;
    }

    getMorseText() {
        return this.morseText;
    }

    getUserName() {
        return this.userName;
    }

    getStatus() {
        return this.status;
    }

    getId() {
        return this.id;
    }

    setPlainText(msg) {
        this.plainText = msg;
    }

    setMorseText(msg) {
        this.morseText = msg;
    }

    setUserName(user) {
        this.userName = user;
    }

    setStatus(st) {
        this.status = st;
    }

    setId(id) {
        this.id = id;
    }

}