<template>
  <div id="app">
    <div class="home">

      <!-- picture of our logo -->
      <img class="logo" src="../assets/logo.png">
    </div>

    <div class="mainContent">

      <!-- input field and submit button -->
      <div>
        <input type="text" v-model="userNameInput" placeholder="Username..." v-on:keypress.enter="submitUserInput()">
        <input type="text" v-model="messageInput" placeholder="Type message..." v-on:keypress.enter="submitUserInput()">
        <button type="button" value="submit" @click="submitUserInput()">Submit</button>
        <br>
        <label class="allowedSigns">Symbols allowed A-Ö, 0-9, ?!,.-()@/%"';:</label>
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
            <td>
              {{ mh.nextPlainMessage }}
            </td>
            <td>
              {{ mh.nextMorseMessage }}
            </td>
          </tr>
        </table>
      </div>

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


    <div class="container">
      <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p class="col-md-4 mb-0 text-muted">&copy; 2022 Morsemate</p>

        <a href="/"
          class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
          <svg class="bi me-2" width="40" height="32">
            <use xlink:href="#bootstrap" />
          </svg>
        </a>
        <ul class="nav col-md-4 justify-content-end">
          <li class="nav-item"><a href="/" class="nav-link px-2 text-muted">Home</a></li>
          <li class="nav-item"><a href="https://github.com/HenningWigforss/II1302/wiki"
              class="nav-link px-2 text-muted">Github</a></li>
          <li class="nav-item"><a href="https://canvas.kth.se/groups/188033/wiki"
              class="nav-link px-2 text-muted">Canvas Side</a></li>
          <li class="nav-item"><a href="/about" class="nav-link px-2 text-muted">About</a></li>
        </ul>
      </footer>
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

      if (verifyMessage(this.messageInput)) {
        this.mh.addMessage(this.userNameInput, this.messageInput)
        this.messageInput = ''
      }
      else {
        alert("Message was invalid. Try again with the included symbols")
        console.error("Message was invalid. Try again with the included symbols")
      }
    }
  }
}
</script>