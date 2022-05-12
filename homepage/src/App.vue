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
}

nav {
  padding-top: 30px;
  padding-bottom: 10px;

  a {
    font-weight: bold;
    color: #2c3e50;
    padding-right: 10px;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}

.logo {
  height: 400px;
  margin-bottom: -40px;
}

.table-responsive{
  margin-top:30px
}

table{
  width: 50%;
  margin-left: auto;
  margin-right: auto;
}

table td{
  padding:0;
  margin:0
}

.queueTable{
  border-collapse: none;
  margin: 0;
  padding: 0;
  width: 100%;
  table-layout: fixed;
}

p {
  font-size: small;
}

h3 {
  padding-top: 20px;
}

// aboutMe peage
body {
  background-color: #f7f7ff;
  margin-top: 20px;
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

label{
  display:block
}

fieldset legend{
  font-size:medium
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