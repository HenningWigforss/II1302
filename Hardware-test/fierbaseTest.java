//firebase
//get data from database
<script>
import { getDatabase, ref, set } from 'firebase/database'
import app from '../firebase'

export default {
  data () {
        return {
      messagesList:{
          messageName: null,
          messageInputFromUser:null,
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
        Name: this.messageName,
        message: this.messageInputFromUser,
        // published: false
      });
     }
  }
      
}
</script>


//---------------Test------------------//
//firebase
//Test to get data from database

<script>
import { getDatabase, ref, set } from 'firebase/database'
import app from '../firebase'

export default {
  data () {
    return {
    messageInputFromUser: null,
    messages:[]
    }
  },
  methods:{
    submitUserInput(){
      const db = getDatabase();
      set(ref(db, 'messages'), {
        name: this.messageInputFromUser
      });
    }
  }
}
</script>

//------------Test--------------//
//firebase config
import { initializeApp } from 'firebase/app';

export const app = initializeApp ({
  apiKey: "AIzaSyC4ayZt3jirbUmToKB4OTY-0AvrDA-bsvo",
  authDomain: "morsemate.firebaseapp.com",
  databaseURL: "https://morsemate-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "morsemate",
  storageBucket: "morsemate.appspot.com",
  messagingSenderId: "546833062025",
  appId: "1:546833062025:web:e0567ad625c9acda780e58",
  measurementId: "G-KNV1V2NTK4"
});