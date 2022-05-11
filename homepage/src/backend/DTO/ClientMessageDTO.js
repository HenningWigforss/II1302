/**
 * The ClientMessageDTO class represents the client message as a
 * Data Transfer Object.
 */

export class ClientMessageDTO {
    plainText;
    userName;

    /**
     * Creates a new instance of the class ClientMessageDTO.
     * 
     * @param msg  String containing message from user.
     * @param user String with the user name.
     */
    ClientMessageDTO(msg, user) {
        this.plainText = msg;
        this.userName = user;
    }

    getPlainText() {
        return this.plainText;
    }

    getUserName() {
        return this.userName;
    }

    setPlainText(msg) {
        this.plainText = msg;
    }

    setUserName(user) {
        this.userName = user;
    }
}