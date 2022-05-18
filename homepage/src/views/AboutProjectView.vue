<title>About MorseMate</title>
<template>

    <div class="aboutProject">
        <h1>Information om MorseMate</h1>
        <p>Morse Mate är ett system för Morse-kommunikation bestående av två delar.
        Ett webbaserat användargränssnitt samt ett Arduino-chipkit.</p>

        <p>En användare kan via hemsidan ange ett meddelande i form av vanlig text.
        Detta meddelande skickas sedan via molnet där det först</p>

        <p>översätts till Morse, för att sedan skickas till ett chipkit
        som visar meddelandet i form av Morsesignaler.</p>
        <h1>Användning</h1>
        <p>En användare kan skriva in ett användarnamn och ett meddelande på hemsidan. 
            Om meddelandet inte innehåller symboler som inte finns med i morsealfabetet så kommer detta 
            meddelande att laddas upp i en "realtime database" som finns på våran Firebase server.</p>
        <p>Meddelandet kommer läggas i en kö och hämtas av MorseMate enheten. Lampor som indikterar att 
            det finns meddelanden att läsa kommer att lysa och meddelanden kan spelas upp på enheten. 
            Enheten har stöd för att läsa nästa meddelande, 
            repetera meddelanden och sluta läsa meddelanden som läses.</p>

        <img class="Concept" src="../assets/Concept.png">
        <p>Detta är en konceptbild som visar hur MorseMate systemet ser ut</p>
        <h1>Om Morse</h1>
        <p>Text som förklarar lite om morse</p>
        <img class="MorseMateAlphabet" src="https://github.com/HenningWigforss/II1302/raw/main/icons/mars.jpg" >


        <div class="container">
      <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p class="col-md-4 mb-0 text-muted">&copy; 2022 Morsemate</p>

        <a href="/"
          class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
          <svg class="bi me-2" width="40" height="32">
            <use xlink:href="#bootstrap" />
          </svg>
        </a>
        <ul class="nav col-md-4 justify-content-end">
          <li class="nav-item"><a href="/" class="nav-link px-2 text-muted">Home</a></li>
          <li class="nav-item"><a href="https://github.com/HenningWigforss/II1302/wiki"
              class="nav-link px-2 text-muted">Github</a></li>
          <li class="nav-item"><a href="https://canvas.kth.se/groups/188033/wiki"
              class="nav-link px-2 text-muted">Canvas Side</a></li>
          <li class="nav-item"><a href="/about" class="nav-link px-2 text-muted">About</a></li>
        </ul>
      </footer>
    </div>
        

    </div>
</template>