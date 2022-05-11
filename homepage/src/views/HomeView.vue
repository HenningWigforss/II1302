<template>
  <div id="app">
    
    <div class="home">
      
      <!-- picture of our logo -->
      <img alt="Vue logo" src="../assets/logo.png" height="300">

      <!-- Description text of what Morse Mate is -->
      <p>Morse Mate är ett system för Morse-kommunikation bestående av två delar. 
        Ett webbaserat användargränssnitt samt ett Arduino-chipkit.</p>
      <p>En användare kan via hemsidan ange ett meddelande i form av vanlig text. 
        Detta meddelande skickas sedan via molnet där det först</p>
      <p>översätts till Morse, för att sedan skickas till ett chipkit 
        som visar meddelandet i form av Morsesignaler.</p>
    </div>
  
    <div class = "mainContent"> 
      
      <!-- input field and submit button -->
      <div>
            <input type="text" v-model="messageInputFromUser" placeholder="Type message..." v-on:keypress.enter="submitUserInput()">   
            <button type="button" value="submit" @click="submitUserInput()">Submit</button>
            <label type="allowedSigns" > (A-Ö, 0-9, ?!,.-()@/%"';:)</label>
      </div>

      <!-- output fields -->
      <div>
        <h3>Output</h3>
        <textarea v-model=nextPlainMessage name="textOutputPlain" id="textOutputPlain" cols="30" rows="10" readonly></textarea>
        <textarea v-model=nextMorseMessage name="textOutputMorse" id="textOutputMorse" cols="30" rows="10" readonly></textarea>
      </div>

    </div>

    <div class = "footer">
      <!-- Links to our github page -->
      <h3>Info</h3>
        <ul>
          <li><a href="https://github.com/HenningWigforss/II1302/wiki/Project-group-14" target="_blank" rel="noopener">About us</a></li>
          <li><a href="https://github.com/HenningWigforss/II1302" target="_blank" rel="noopener">GitHub</a></li>
        </ul>
    </div>

  </div>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src

@Options({
  components: {
    HelloWorld,
  },
})
export default class HomeView extends Vue {

      messageInputFromUser = ''
      nextPlainMessage = ''
      nextMorseMessage = ''
      name = 'App'

      //Submits the string message user inputs on webpage
      submitUserInput() {
        this.nextPlainMessage = this.messageInputFromUser
        this.nextMorseMessage = this.messageInputFromUser
      }

      //retrieves the plain message that is first in queue
      retrieveNextPlainMessage() {
        //todo
      }

      //retrieves the morse translated message that is first in queue
      retrieveNextMorseMessage() {
        //todo
      }
    }
</script>
