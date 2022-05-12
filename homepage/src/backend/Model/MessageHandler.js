import { translateString } from '../Utility/MorseTranslator'

/**
 * Class that handles all messages from the client.
 */
export class MessageHandler {
    // Create a new instance of the message handler.
    constructor() {
        this.messageList = []
    }

    addMessage(userName, msg) {
        var newMessage = {
            userName: userName,
            plainText: msg,
            morseText: translateString(msg),
            //submittedTime: Date().getHours() + ":" + Date().getMinutes() + ":" + Date().getSeconds()
        }
        this.messageList.push(newMessage);
        console.log("Added message: " + msg + " to the list. The list now contains " + this.messageList.length + " messages.")
        console.log(this.messageList)
    }

    /**
     * Lets the Message handler know that the message has been read and deletes the
     * first message in queue.
     */
    removeRead() {
        this.messageList.shift();
    }

    /**
     * Updates real time date base.
     */
    updateRTDB() {
        return;
    }

    //Old MorseMateHandler
    cmdMessage(cmd) {
        if(!cmd){ cmd = "Default" }
        var cmdMessage = cmd + '|' + this.messageList.length + '|' + this.messageList[0].morseText;

        return cmdMessage;
    }

    /*static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        ClientMessageDTO cMessage = new ClientMessageDTO("Arbeta Agilt", "Anders Sjögren");
        ClientMessageDTO cMessage2 = new ClientMessageDTO("Arbeta Agilt IDIOT", "Anders Sjögren");

        messageHandler.addMessage(cMessage);
        messageHandler.addMessage(cMessage2);

        System.out.println(messageHandler.getMessageInQueue());

        LinkedList<MessageDTO> msgList = new LinkedList<>();

        msgList = messageHandler.fetchMessageList();

        System.out.println(msgList.getFirst().getPlainText());
    }*/
}

export default MessageHandler