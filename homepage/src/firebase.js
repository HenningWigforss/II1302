import { initializeApp } from 'firebase/app';

let firebaseConfig = {
  apiKey: "AIzaSyC4ayZt3jirbUmToKB4OTY-0AvrDA-bsvo",
  authDomain: "morsemate.firebaseapp.com",
  databaseURL: "https://morsemate-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "morsemate",
  storageBucket: "morsemate.appspot.com",
  messagingSenderId: "546833062025",
  appId: "1:546833062025:web:e0567ad625c9acda780e58",
  measurementId: "G-KNV1V2NTK4"
};

const firebase = initializeApp(firebaseConfig);
const db = firebase.database()
const RTDB = db.ref('MorseMate')

export default RTDB;