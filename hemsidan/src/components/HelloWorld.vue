<template>
  <div class="hello">
    <!-- <h1>{{ msg }}</h1> -->
    <h2>Projekt Grupp 14</h2>
    <h2>Morse Mate</h2>
    <p>
      Morse Mate är ett system för Morse-kommunikation bestående av två delar. Ett webbaserat användargränssnitt samt ett Arduino-chipkit. En användare kan via hemsidan ange ett meddelande i form av vanlig text. Detta meddelande skickas sedan via molnet där det först översätts till Morse, för att sedan skickas till ett chipkit som visar meddelandet i form av Morsesignaler.
    </p>

    <div class ="inputAndButton">
    <form class="form-inline" @submit.prevent="searchName">
        <h3><label>Enter Message</label></h3>
        <input type="text" name="name" class="form-control" v-model="search">   
        <input id="clickMe" type="submit" value="Submit"/> 
    </form>
    </div>

    <h3>Info</h3>
    <ul>
      <li><a href="https://github.com/HenningWigforss/II1302/wiki/Project-group-14" target="_blank" rel="noopener">About us</a></li>
      <li><a href="https://github.com/HenningWigforss/II1302" target="_blank" rel="noopener">GitHub</a></li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
