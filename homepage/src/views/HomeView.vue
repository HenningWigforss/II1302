<template>
  <div id="app">
    <div class="home">

      <!-- picture of our logo -->
      <img class="logo" src="../assets/logo.png">

      <!-- Description text of what Morse Mate is -->

      <body>Morse Mate är ett system för Morse-kommunikation bestående av två delar.
        Ett webbaserat användargränssnitt samt ett Arduino-chipkit.</body>

      <body>En användare kan via hemsidan ange ett meddelande i form av vanlig text.
        Detta meddelande skickas sedan via molnet där det först</body>

      <body>översätts till Morse, för att sedan skickas till ett chipkit
        som visar meddelandet i form av Morsesignaler.</body>
      <br>
    </div>

    <div class="mainContent">

      <!-- input field and submit button -->
      <div>
        <input type="text" v-model="userNameInput" placeholder="Username..." v-on:keypress.enter="submitUserInput()">
        <input type="text" v-model="messageInput" placeholder="Type message..." v-on:keypress.enter="submitUserInput()">
        <button type="button" value="submit" @click="submitUserInput()">Submit</button>
        <label type="allowedSigns"> (A-Ö, 0-9, ?!,.-()@/%"';:)</label>
      </div>

      <!-- output fields -->
      <div>
        <h3>Next Message:</h3>
        <table>
          <tr>
            <td>
              <fieldset>
                <legend>Plain Text</legend>
                <textarea v-model=nextPlainMessage id="textOutputPlain" cols="40" rows="4" readonly></textarea>
              </fieldset>
            </td>
            <td>
            <fieldset>
              <legend>Morse Text</legend>
              <textarea v-model=nextMorseMessage id="textOutputMorse" cols="40" rows="4" readonly></textarea>
            </fieldset>
            </td>
          </tr>
        </table>


      </div>

      <div class="table-responsive">
        <table class="queueTable" v-if="mh.messageList">
          <thead>
            <tr>
              <th>Queue: {{ mh.messageList.length }}</th>
              <!-- and so on -->
            </tr>
          </thead>
          <tbody>
            <tr v-for="message in mh.messageList" :key="message">
              {{ message.userName }}
            </tr>
          </tbody>
        </table>
      </div>
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

<script lang="ts">
import { Options, Vue } from 'vue-class-component';
import HelloWorld from '../components/HelloWorld.vue'; // @ is an alias to /src
import MessageHandler from "../backend/Model/MessageHandler"
import verifyMessage from "../backend/Utility/MessageCheck"
//new firebase config
import { getDatabase, ref, set } from 'firebase/database'
import app from '../firebase'

@Options({
  components: {
    HelloWorld,
  },
})
export default class HomeView extends Vue {
  mh = new MessageHandler();
  userNameInput = ''
  messageInput = ''
  nextPlainMessage = ''
  nextMorseMessage = ''
  name = 'App'

  //Submits the string message user inputs on webpage
  submitUserInput() {
    if (verifyMessage(this.messageInput)) {
      this.mh.addMessage(this.userNameInput, this.messageInput)
      this.retrieveNextMorseMessage()
      this.retrieveNextPlainMessage()
    }
    else {
      alert("Message was invalid. Try again with the included symbols")
      console.error("Message was invalid. Try again.")
    }
  }

  //retrieves the plain message that is first in queue
  retrieveNextPlainMessage() {
    this.nextPlainMessage = this.mh.messageList[0].plainText
  }

  //retrieves the morse translated message that is first in queue
  retrieveNextMorseMessage() {
    this.nextMorseMessage = this.mh.messageList[0].morseText
  }
}
</script>