<template>
  <div id="app">

    <div class="mainContent">

      <!-- input field and submit button -->
      <div>
        <input type="text" v-model="userNameInput" placeholder="Username..." v-on:keypress.enter="submitUserInput()">
        <input type="text" v-model="messageInput" placeholder="Type message..." v-on:keypress.enter="submitUserInput()">
        <button type="button" value="submit" @click="submitUserInput()">Submit</button>
        <br>
        <label class="allowedSigns">Symbols allowed A-Ö, 0-9, ?!,.-()@/%"';: <br> Maximum message size: 200 symbols.</label>
      </div>

      <!-- output fields -->
      <div>
        <h4 class="nextMessage">Next Message</h4>
        <table>
          <thead>
            <tr>
              <th>
                Plain Text
              </th>
              <th>
                Morse Text
              </th>
            </tr>
          </thead>
          <tr>
            <td class="nextMessage">
              {{ mh.nextPlainMessage }}
            </td>
            <td class="nextMessage">
              {{ mh.nextMorseMessage }}
            </td>
          </tr>
        </table>
      </div>

      
      <!-- queue side bar -->
      <div>
        <th>Message Queue</th>
        <table class="queueTable">
          <thead>
            <tr>
              <th colspan="3">Message Queue</th>
            </tr>
            <tr>
              <td>#</td>
              <td>User</td>
              <td>Time</td>
            </tr>
          </thead>
          <tbody v-if="mh.messageList">
            <tr v-for="(message, index) in mh.messageList" :key="message">
              <td>{{ index + 1 }}</td>
              <td>{{ message.userName }}</td>
              <td>{{ message.submittedTime }}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>


    <!-- admin options -->
    <div>
      <table class="adminTable">
        <thead>
          <tr>
            <th colspan="2">Admin Tools</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td><button @click="mh.removeRead()">Remove Read</button></td>
            <td><button @click="mh.clearMessageList()">Clear Messages</button></td>
          </tr>
        </tbody>
      </table>
    </div>


  </div>
</template>

<script>
import MessageHandler from "../backend/Model/MessageHandler"
import verifyMessage from "../backend/Utility/MessageCheck"

export default {
  data() {
    return {
      mh: new MessageHandler(),
      userNameInput: '',
      messageInput: '',
      name: 'App',
    }
  },

  methods: {
    //Submits the string message user inputs on webpage
    submitUserInput() {
      if(this.messageInput.length > 200){
        alert("Message is longer than the maximum size. You can't send messages longer than 200 symbols.")
        console.error("Message is longer than the maximum size. You can't send messages longer than 200 symbols.")
      }

      if(this.messageInput == ''){
        alert("You have to enter a message. Try again.")
        console.error("You have to enter a message. Try again.")
        return;
      }

      if(this.userNameInput == ''){
        alert("You have to enter a username. Try again.")
        console.error("You have to enter a username. Try again.")
        return;
      }

      var errorChar = verifyMessage(this.messageInput)
      if (!errorChar) {
        this.mh.addMessage(this.userNameInput, this.messageInput)
        this.messageInput = ''
      }
      else {
        alert("Message was invalid, you used the char " + errorChar + ". Try again with the included symbols")
        console.error("Message was invalid. Try again with the included symbols")
      }
    }
  }
}
</script>