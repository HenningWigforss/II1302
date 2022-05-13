import { translateString } from '../Utility/MorseTranslator'
import { getDatabase, ref, set, onValue } from 'firebase/database'
import { app } from '../../firebase'

/**
 * Class that handles all messages from the client.
 */
export class MessageHandler {
    // Create a new instance of the message handler.
    constructor() {
        const db = getDatabase()
        const mLRef = ref(db)
        onValue(mLRef, (snapshot) => {
                this.messageList = snapshot.child('messageList').val() ? snapshot.child('messageList').val() : []
                this.nextPlainMessage = snapshot.child('nextPlainMessage').val() ? snapshot.child('nextPlainMessage').val() : ''
                this.nextMorseMessage = snapshot.child('nextMorseMessage').val() ? snapshot.child('nextMorseMessage').val() : ''
            })
    }

    addMessage(userName, msg) {
        var newMessage = {
            userName: userName,
            plainText: msg,
            morseText: translateString(msg),
            submittedTime: this.getTime()
        }
        this.messageList.push(newMessage);
    
        //console.log("Added message: " + msg + " to the list. The list now contains " + this.messageList.length + " messages.")
        //console.log(this.messageList)

        this.updateNextMessage()
        this.updateRTDB()
    }

    getTime() {
        var date = new Date()
        var hours = (date.getHours() < 10) ? '0' + date.getHours() : date.getHours();
        var minutes = (date.getMinutes() < 10) ? '0' + date.getMinutes() : date.getMinutes();
        var seconds = (date.getSeconds() < 10) ? '0' + date.getSeconds() : date.getSeconds();
        var time = hours + ":" + minutes + ":" + seconds

        return time;
    }

    clearMessageList() {
        this.messageList = []
        this.nextMorseMessage = ''
        this.nextPlainMessage = ''
        this.updateRTDB()
    }

    /**
     * Lets the Message handler know that the message has been read and deletes the
     * first message in queue.
     */
    removeRead() {
        if (this.messageList.length > 1){
            this.messageList.shift();
            this.updateNextMessage()
        }
        else
            this.clearMessageList()
        this.updateRTDB()
    }

    updateNextMessage(){
        this.nextMorseMessage = this.messageList[0].morseText
        this.nextPlainMessage = this.messageList[0].plainText
    }

    /**
     * Updates real time date base.
     */
    updateRTDB() {
        const db = getDatabase();
        set(ref(db), {
            messageList: this.messageList,
            nextMorseMessage: this.nextMorseMessage,
            nextPlainMessage: this.nextPlainMessage,
            cmdMessage: this.cmdMessage(),
        });
    }

    //Old MorseMateHandler
    cmdMessage(cmd) {
        if (!cmd) { cmd = "Default" }
        if (this.messageList[0])
            var cmdMessage = cmd + '|' + this.messageList.length + '|' + this.nextMorseMessage;
        else
            cmdMessage = cmd + '|' + 0 + '|' + ""

        return cmdMessage;
    }
}

export default MessageHandler