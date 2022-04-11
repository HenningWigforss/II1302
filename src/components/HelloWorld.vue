<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      This is the web page for project group 14. The Project is part of KTH course II1302 “Projekt och projektmetoder”.<br>
      check out our github 
      <a href="https://github.com/HenningWigforss/II1302" target="_blank" rel="noopener">GITHUB</a>.
    </p>
    <h3>Please sign in</h3>
    <ul>
      <li><a href="" target="_blank" rel="noopener">Username...</a></li>
      <li><a href="" target="_blank" rel="noopener">Password...</a></li>
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
