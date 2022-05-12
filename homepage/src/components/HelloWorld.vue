<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
</template>

//Send to firebase
<script lang="ts">
//new firebase config
import { Options, Vue } from 'vue-class-component';
import { getDatabase, ref, set } from 'firebase/database'
import app from '../firebase'


export default {
  data () {
        return {
      messagesList:{
          userNameInput: null,
          messageInput:null,
        // published: false
      },
      // submitted: false
    };
  },
  methods: {
    submitUserInput() {
      const db = getDatabase();
      set(ref(db, 'messagesList'), 
      {
        // Name: this.messagesList.userNameInput,
        // message: this.messageInput,
        // published: false
      });
     }
  }   
}
</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
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
