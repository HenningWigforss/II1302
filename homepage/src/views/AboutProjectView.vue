<!-- Page describing our project-->
<title>About MorseMate</title>
<template>

    <div class="AboutProject">
<!-- Section describing MorseMate  -->
        <div class="AboutMorseMate">
        <h1>Information om MorseMate</h1>
        <p>Morse Mate är ett system för Morse-kommunikation bestående av två delar.
            Ett webbaserat användargränssnitt samt ett Arduino-chipkit.
            En användare kan via hemsidan ange ett meddelande i form av vanlig text.
            Detta meddelande skickas sedan via molnet där det först
            översätts till Morse, för att sedan skickas till ett chipkit
            som visar meddelandet i form av Morsesignaler.</p>
        </div>

<!-- Section describing how to use MorseMate -->
        <div class="Uses">
        <h1>Användning</h1>
        <p>En användare kan skriva in ett användarnamn och ett meddelande på hemsidan. 
            Om meddelandet inte innehåller symboler som inte finns med i morsealfabetet så kommer detta 
            meddelande att laddas upp i en "realtime database" som finns på våran Firebase server.
            Meddelandet kommer läggas i en kö och hämtas av MorseMate enheten. Lampor som indikterar att 
            det finns meddelanden att läsa kommer att lysa och meddelanden kan spelas upp på enheten. 
            Enheten har stöd för att läsa nästa meddelande, 
            repetera meddelanden och sluta läsa meddelanden som läses.</p>
        </div>

<!-- Concept picture  -->
        <img class="Concept" src="../assets/Concept.png">
        <div class="conceptText">
        <p>Detta är en konceptbild som visar hur MorseMate systemet ser ut</p>
        </div>

<!-- About Morse in general  -->
        <div class="AboutMorse">
        <h1>Om Morse</h1>
        <p>Text som förklarar lite om morse</p>
        <img class="MorseMateAlphabet" src="https://github.com/HenningWigforss/II1302/raw/main/icons/mars.jpg" >        
        </div>
    </div>
</template>