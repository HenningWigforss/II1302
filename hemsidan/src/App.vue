<!-- HTML delen -->
<template>
  <div id="app">
    
    <div class="header">
      
      <!-- picture of our logo -->
      <img alt="Vue logo" src="./assets/logo.png" height="300">

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
        <form>
            <label >Input</label>
            <input type="messageInputFromUser" v-model="messageInputFromUser" placeholder="Type message...">   
            <label type="allowedSigns" >(A-Ö, 0-9, ?!,.-()@/%"';:)</label>
            <button type="submit" value="Submit" @click="submitUserInput">Submit</button>
        </form>
      </div>
      
      <p>{{messageInputFromUser}}</p>



      <!-- output fields -->
      <div>
        <h3>Output</h3>
        <textarea name="textOutputPlain" id="textOutputPlain" cols="30" rows="10" readonly></textarea>
        <textarea name="textOutputMorse" id="textOutputMorse" cols="30" rows="10" readonly></textarea>
      </div>

    </div>
    
    
    <!-- webbpage footer -->
    <div>
      <!-- output fields prints out next message in plain/morse text -->
      <h3>Output</h3>
      <textarea name="textOutputPlain" id="textOutputPlain" cols="30" rows="10" readonly></textarea>
      <textarea name="textOutputMorse" id="textOutputMorse" cols="30" rows="10" readonly></textarea>
    </div>
</template>


<!-- javaScript delen -->
<script>

// this is a comment in JS
  export default {
    data() {
      return {
        messageInputFromUser: '',
        nextPlainMessage: '',
        nextMorseMessage: ''
      }
    },
    methods: {

      //Submits the string message user inputs on webpage
      submitUserInput() {
        //todo
      },


      //retrieves the plain message that is first in queue
      retrieveNextPlainMessage() {
        //todo
      },

      //retrieves the morse translated message that is first in queue
      retrieveNextMorseMessage() {
        //todo
      }




    }
  }


// this is a comment in JS. This script part is BS, FIX IT!
export default {
  name: 'App'
}

</script>


<!-- CSS delen -->
<style>
/* this is a comment in CSS*/
#app {
  font-family: Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
