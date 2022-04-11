import * as firebase from 'firebase';

const settings = { timestapsInSnapshot: true };

const firebaseConfig = {
    apiKey: "AIzaSyC4ayZt3jirbUmToKB4OTY-0AvrDA-bsvo",
    authDomain: "morsemate.firebaseapp.com",
    databaseURL: "https://morsemate-default-rtdb.europe-west1.firebasedatabase.app",
    projectId: "morsemate",
    storageBucket: "morsemate.appspot.com",

};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
firebase.firebase().settings(settings);
export default firebase;
