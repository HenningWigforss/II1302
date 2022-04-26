<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to project group 14 GDPR approved"/>
    <div class ="inputAndButton">
    <form class="form-inline" @submit.prevent="searchName">
        <h3><label>Enter Message</label></h3>
        <input type="text" name="name" class="form-control" v-model="search">   
        <input id="clickMe" type="submit" value="Submit"/> 
    </form>
</div>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
