// import firebase from "firebase";
// var firebaseConfig = {
//   apiKey: "AIzaSyC4ayZt3jirbUmToKB4OTY-0AvrDA-bsvo",
//   authDomain: "morsemate.firebaseapp.com",
//   databaseURL: "https://morsemate-default-rtdb.europe-west1.firebasedatabase.app",
//   projectId: "morsemate",
//   storageBucket: "morsemate.appspot.com",
//   messagingSenderId: "546833062025",
//   appId: "1:546833062025:web:e0567ad625c9acda780e58",
//   measurementId: "G-KNV1V2NTK4"
// };

// // Initialize Firebase
// export default firebase.initializeApp(firebaseConfig);

// import * as firebase from 'firebase';
import { initializeApp } from "firebase";
// import initializeApp from 'firebase/compat/app'


const app = initializeApp({
  apiKey: "AIzaSyC4ayZt3jirbUmToKB4OTY-0AvrDA-bsvo",
  authDomain: "morsemate.firebaseapp.com",
  databaseURL: "https://morsemate-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "morsemate",
  storageBucket: "morsemate.appspot.com",
  messagingSenderId: "546833062025",
  appId: "1:546833062025:web:e0567ad625c9acda780e58",
  measurementId: "G-KNV1V2NTK4"
  });

//   // firebase.initializeApp(config);

  export const db = app.database();
  export const messageRef = db.ref('massages');
  // export default firebase;