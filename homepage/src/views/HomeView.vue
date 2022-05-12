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
            <input type="text" v-model="messageInputFromUser" placeholder="Type message..." v-on:keypress.enter="submitUserInput()">    -->
             <button type="button" value="submit" @click="submitUserInput()">Submit</button>
            <!-- <input type="text" v-model="message" placeholder="Type message..." v-on:keypress.enter="submitUserInput()">    
            <button class="btn btn-outline-primary radius-15" type="button" value="submit" @click="submitMessage()">Submit</button> -->
            <label type="allowedSigns" > (A-Ö, 0-9, ?!,.-()@/%"';:)</label>
      </div>
    <div> 
      <h>
        <p>
          <a>

          </a>
        </p>
      </h>
    </div>
      <!-- output fields -->
      <div>
        <h3>Output</h3>
        <textarea v-model=nextPlainMessage name="textOutputPlain" id="textOutputPlain" cols="30" rows="10" readonly></textarea>
        <textarea v-model=nextMorseMessage name="textOutputMorse" id="textOutputMorse" cols="30" rows="10" readonly></textarea>
      </div>

    </div>




<!-- footer webpage -->
<div class="container">
  <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
    <p class="col-md-4 mb-0 text-muted">&copy; 2022 Morsemate</p>

    <a href="/" class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
      <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
    </a>
    <ul class="nav col-md-4 justify-content-end">
      <li class="nav-item"><a href="/" class="nav-link px-2 text-muted">Home</a></li>
      <li class="nav-item"><a href="https://github.com/HenningWigforss/II1302/wiki" class="nav-link px-2 text-muted">Github</a></li>
      <li class="nav-item"><a href="https://canvas.kth.se/groups/188033/wiki" class="nav-link px-2 text-muted">Canvas Side</a></li>
      <li class="nav-item"><a href="/about" class="nav-link px-2 text-muted">About</a></li>
    </ul>
  </footer>
</div>




</div>
</template>








<script>// Imports
// import {messageRef} from '/firebase'
// import { messageRef }  from 'firebase/app'
// import { messageRef } from 'firebase/database';
// import messageRef from 'firebase/compat/app'
// import { messageRef } from 'firebase/compat/firestore'
// // import { messageRef } from 'firebase/database';

// // import '@firebase/firestore'

// export default {
//     data() {
//       return {
//       message: ''
//       }
//     },
//     methods: {
//       submitMessage(){
//         messageRef.push({message:this.message, edit: false})
//       }
//     }
// }






import { Options, Vue } from 'vue-class-component';
import AboutViewVue from './AboutView.vue';
import HelloWorld from '@/components/HelloWorld.vue';

// import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src

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