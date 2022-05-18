<template>
  <nav>
    <router-link to="/">Home</router-link>
    <router-link to="/about">About</router-link>
  </nav>
  <router-view />
</template>

<style lang="scss">
#app {
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  background-color: #e8e8ff;
}

nav {
  padding-top: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;
    padding-right: 10px;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}

.nextMessage{
   word-wrap: break-word;
}

button:hover{
  background-color:#ffffff;
}

button:active{
  background-color: #dcdcff;
}

.allowedSigns {
  font-size: small
}

.nextMessage{
  padding-top: 50px;
  margin-bottom: -5px;
}

.logo {
  height: 325px;
  margin-top: 0px;
  margin-bottom: 30px;
}

table:not(.queueTable):not(.adminTable) {
  width: auto;
  margin-left: auto;
  margin-right: auto;
  padding-bottom: 40px;
  border-spacing: 5px;
  display: inline-block;
  margin-top: 20px;
}

table td:not(.queueTable td):not(.adminTable td) {
  padding: 5px;
  width: 250px;
  height: 100px;
  border: 1px solid;
  background-color:#ffffff;
}

table textarea {
  text-align: center;
}

.queueTable {
  padding: 0;
  width: auto;
  table-layout: fixed;
  margin: auto;
  position: absolute;
  top: 0; bottom: 0; right: 10%;
  border: 1px solid;
    background-color:#ffffff;
}

.queueTable td{
  padding-left: 15px;
  padding-right: 15px;
}

.adminTable{
  margin:auto;
}

p {
  font-size: small;
}

// aboutMe peage
body {
  background-color: #f7f7ff;
}

.radius-15 {
  border-radius: 15px;
}

.card {
  position: relative;
  display: flex;
  flex-direction: column;
  min-width: 0;
  word-wrap: break-word;
  background-color: #fff;
  background-clip: border-box;
  border: 0px solid rgba(0, 0, 0, 0);
  border-radius: .25rem;
  margin-bottom: 1.5rem;
  box-shadow: 0 2px 6px 0 rgb(218 218 253 / 65%), 0 2px 6px 0 rgb(206 206 238 / 54%);
}

element.style {}

.list-inline-item:not(:last-child) {
  margin-right: .5rem;
}

label {
  display: block
}

.contacts-social a {
  font-size: 16px;
  width: 36px;
  height: 36px;
  line-height: 36px;
  background: #ffffff;
  border: 1px solid #eeecec;
  text-align: center;
  border-radius: 50%;
  color: #2b2a2a;
}

.bg-facebook {
  background-color: #3b5998 !important;
}

.bg-twitter {
  background-color: #55acee !important;
}

.bg-linkedin {
  background-color: #0976b4 !important;
}
</style>