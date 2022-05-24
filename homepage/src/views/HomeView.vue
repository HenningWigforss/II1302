<template>
  <div id="app">

    <div class="mainContent">

      <!-- input field and submit button -->
      <div>
        <input class="messageInputField" type="textarea" v-model="messageInput" placeholder="Type message..." v-on:keypress.enter="submitUserInput()">
        <br>
        <input class="nameInputField" type="text" v-model="userNameInput" placeholder="Name..." v-on:keypress.enter="submitUserInput()">
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
      var error = verifyMessage(this.messageInput, this.userNameInput)

      if (!error) {
        this.mh.addMessage(this.userNameInput, this.messageInput)
        this.messageInput = ''
      }

      else {
        alert(error)
        console.error(error)
      }
    }
  }
}
</script>