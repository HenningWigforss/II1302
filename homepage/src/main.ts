// import '@firebase/firestore'
import '/firebase'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import 'bootstrap/dist/css/bootstrap.min.css'

import firebase from 'firebase/compat/app'
// import 'firebase/compat/auth';
// import 'firebase/compat/firestore';
// import * as firebase from 'firebase';

// import './firebase';
 

createApp(App).use(router).mount('#app')