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
      <form class="form-inline" @submit.prevent="searchName">
          <input type="text" id ="messageInputFromUser" name="messageInputFromUser" value="Type message...">   
          <input type="submit" id="submitButtonInputFromUser" name="submitButtonInputFromUser" value="Submit"/> 
      </form>

      <!-- output fields prints out next message in plain/morse text -->
      <h3>Output</h3>
      <textarea name="textOutputPlain" id="textOutputPlain" cols="30" rows="10" readonly></textarea>
      <textarea name="textOutputMorse" id="textOutputMorse" cols="30" rows="10" readonly></textarea>
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


<!-- javaScript delen -->
<script>
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
