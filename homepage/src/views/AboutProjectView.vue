<!-- Page describing our project-->
<title>About MorseMate</title>
<template>

    <div class="AboutProject">
<!-- Section describing MorseMate  -->
      <div class="Header">
        <h1>Information om MorseMate</h1>
      </div>
        <div class="AboutMorseMate">
          <p>Morse Mate är ett system för Morse-kommunikation bestående av två delar.
            Ett webbaserat användargränssnitt samt ett Arduino-chipkit.
            En användare kan via hemsidan ange ett meddelande i form av vanlig text.
            Detta meddelande skickas sedan via molnet där det först
            översätts till Morse, för att sedan skickas till ett chipkit
            som visar meddelandet i form av Morsesignaler.</p>
        </div>

<!-- Section describing how to use MorseMate -->
        <div class="Header">
          <h1>Användning</h1>
        </div>
        <div class="Uses">
          <p>En användare kan skriva in ett användarnamn och ett meddelande på hemsidan. 
            Om meddelandet inte innehåller symboler som inte finns med i morsealfabetet så kommer detta 
            meddelande att laddas upp i en "realtime database" som finns på våran Firebase server.
            Meddelandet kommer läggas i en kö och hämtas av MorseMate enheten. Lampor som indikterar att 
            det finns meddelanden att läsa kommer att lysa och meddelanden kan spelas upp på enheten. 
            Enheten har stöd för att läsa nästa meddelande, 
            repetera meddelanden och sluta läsa meddelanden som läses.</p>
        </div>

<!-- Concept picture  -->
      <div class="Header">
        <h1>Konceptbild av MorseMate systemet</h1>
      </div>
      <center>
        <img class="Concept" alt="centered image" src="../assets/Concept.png">
      </center>
        <div class="conceptText">
          <p>Detta är en konceptbild som visar hur MorseMate systemet ser ut. Detta koncept togs fram under 
            inledningen av arbetet och hjälpte gruppen att göra en övergripande design av hur systemet skall se ut.</p>
        </div>
      <div class="Header">
        <h1>Prototyp av MorseMate systemet</h1>
      </div>
      <center>
        <img class="Prototype" alt="centered image" src="../assets/MorseMate.jpg">
      </center>
      <div class="conceptText">
         <p>Detta är prototypen av enheten MorseMate. Den består av en Arduino Uno, en breadboard, dioder, resistorer, kablar och en högtalare. På bilden är inte systemet anslutet till något WiFi - chip. </p>
      </div>

<!-- About Morse in general  -->
      <div class="Header">
        <h1>Om Morse</h1>
      </div>
        <div class="AboutMorse">
          <p>Morsealfabetet är ett kodsystem för överföring med telegrafi. Det är – till skillnad från 
            dagens maskintelegrafi och datorkommunikationsutrustning – avsett att hanteras av människor, 
            och ger en betydligt långsammare överföringshastighet än vad man i en ostörd miljö idag kan 
            uppnå med maskiners hjälp. För mer information se <a href="https://sv.wikipedia.org/wiki/Morsealfabetet"
              >Wikipedia</a></p>        
        </div>
        <center>
          <img class="MorseMateAlphabet" src="https://github.com/HenningWigforss/II1302/raw/main/icons/mars.jpg" >
        </center>
    </div>
    
</template>