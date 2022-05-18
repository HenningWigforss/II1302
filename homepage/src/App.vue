<template>
  <div>
    <!-- navigation menu -->
    <nav>
      <router-link to="/">Home</router-link>
      <router-link to="/about">About Us</router-link>
      <router-link to="/aboutProject">About Project</router-link>
    </nav>

    <!-- header with logo -->
    <header>
      <div>
        <img class="logo" src="../src/assets/logo.png">
      </div>
    </header>
    

    <!-- main content: is controlled by router-view -->
    <section>
      <div>
        <router-view />
      </div>
    </section>

    <!-- footer contains github/canvas links -->
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p class="col-md-4 mb-0 text-muted">&copy; 2022 Morsemate</p>

        <a href="/"
          class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
          <svg class="bi me-2" width="40" height="32">
            <use xlink:href="#bootstrap" />
          </svg>
        </a>
        <ul class="nav col-md-4 justify-content-end">
          <li class="nav-item"><a href="https://github.com/HenningWigforss/II1302/wiki"
              class="nav-link px-2 text-muted">Github</a></li>
          <li class="nav-item"><a href="https://canvas.kth.se/groups/188033/wiki"
              class="nav-link px-2 text-muted">Canvas</a></li>
        </ul>
      </footer>


    
  </div>
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
    height: 200px;
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

  // aboutUs page
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

// About Project
.Concept {
  height: 500px;
  margin-top: 0px;
  margin-bottom: 30px;
}
.MorseMateAlphabet {
  height: 500px;
  margin-top: 0px;
  margin-bottom: 30px;
}

.AboutProject {
  text-align: left;
}
</style>