int morseLed = 2;             //The red led that will blink the morse translation
int activeLed = 3;            //The green led that will show if a message is currently being played.
int firstQueueLed = 4;        //First led of the queue
int lastQueueLed = 8;         //The last led for the queue, all pins between the first and the last will be initiated.
int startButton = 9;          //The button to start reading the next message in the queue  (Blue)
int abortButton = 10;         //Abort playing the current message  (Red)
int repeatButton = 11;        //Repeats the last played message (White)
int speaker = 12;             //Speaker pin
int speakerFrequency = 440;   //The speaker frequency in Hz
int timeUnit = 200;           //The time unit declared in ms

void setup() {
  //Initiate all pins
  pinMode(morseLed, OUTPUT);
  pinMode(activeLed, OUTPUT);
  pinMode(speaker, OUTPUT);
  pinMode(startButton, INPUT);
  pinMode(abortButton, INPUT);
  pinMode(repeatButton, INPUT);

  //Initiate the blue lights queue
  for (int led = firstQueueLed; led < lastQueueLed + 1; led++) {
    pinMode(led, OUTPUT);
  }
}

//Plays a single dot with the defined time unit. Will also add a time unit delay after playing.
void playDot() {
  tone(speaker, speakerFrequency);
  digitalWrite(morseLed, HIGH);
  delay(timeUnit);
  noTone(speaker);
  digitalWrite(morseLed, LOW);
  delay(timeUnit);
}

//Plays a single dash with the defined time unit. Will also play a time unit delay after playing.
void playDash() {
  tone(speaker, speakerFrequency);
  digitalWrite(morseLed, HIGH);
  delay(3 * timeUnit);
  noTone(speaker);
  digitalWrite(morseLed, LOW);
  delay(timeUnit);
}

//Pause after each letter
void letterPause() {
  delay(2 * timeUnit); // An extra delay of 2 time units for each letter(2 since we already have a 1 time unit delay after each char)
}

//Pause after each word
void wordPause() {
  delay(4 * timeUnit); // An extra delay of 2 time units after each word (4 since we already have a 3 time unit delay after each letter)
}

//The whole morse alphabet defined, the function returns the morse translation of a single letter.
String morseAlphabet(char letter) {
  if (isalpha(letter)) {
    letter = tolower(letter);
  }

  String alphabet[][2] = {
    {"a", ".- "},
    {"b", "-... "},
    {"c", "-.-. "},
    {"d", "-.. "},
    {"e", ". "},
    {"f", "..-. "},
    {"g", "--. "},
    {"h", ".... "},
    {"i", ".. "},
    {"j", ".--- "},
    {"k", "-.- "},
    {"l", ".-.. "},
    {"m", "-- "},
    {"n", "-. "},
    {"o", "--- "},
    {"p", ".--. "},
    {"q", "--.- "},
    {"r", ".-. "},
    {"s", "... "},
    {"t", "- "},
    {"u", "..- "},
    {"v", "...- "},
    {"w", ".-- "},
    {"x", "-..- "},
    {"y", "-.-- "},
    {"z", "--.. "},
    {"å", ".--.- "},
    {"ä", ".-.- "},
    {"ö", "---. "},
    {"1", ".---- "},
    {"2", "..--- "},
    {"3", "...-- "},
    {"4", "....- "},
    {"5", "..... "},
    {"6", "-.... "},
    {"7", "--... "},
    {"8", "---.. "},
    {"9", "----. "},
    {"0", "----- "},
    {" ", ","}
  };

  //Loop through the alphabet to find the letter, then return it's morse translation.
  for (auto i : alphabet) {
    if (i[0][0] == letter) {
      return i[1];
    }
  }

  return;
}

//Translates a full string and returns the translation as a string.
String translateMorse(String message) {
  String morseMessage = "";
  for (auto i : message) {
    morseMessage += morseAlphabet(i);
  }
  return morseMessage;
}

//Updates the message queue, turning on the leds needed.
void updateQueue() {
  //Fetch the queue amount
  String fullMessage = "2;Arbeta Agilt";
  int queue = fullMessage[0] - '0';

  //Turn on the leds to show the current queue.
  for (int pin = firstQueueLed; pin < queue + firstQueueLed; pin++) {
    digitalWrite(pin, HIGH);
  }

  //Turn off all the pins not part of the queue.
  for (int pin = queue + firstQueueLed; pin < lastQueueLed + 1; pin++) {
    digitalWrite(pin, LOW);
  }
}

//Fetches the next message from the server, removes the queue number.
String fetchMessage() {
  String fullMessage = "1;Arbeta Agilt";

  int start = fullMessage.indexOf(";");
  String message = fullMessage.substring(start + 1);

  

  return translateMorse(message);
}

void playMessage(String morseMessage) {
  digitalWrite(activeLed, HIGH);
  //Loops through the message char by char.
  for (auto i : morseMessage) {
    if (digitalRead(abortButton) == HIGH) {
      break;
    }
    if (i == '.') {
      playDot();
    }
    else if (i == '-') {
      playDash();
    }
    else if (i == ',') {
      wordPause();
    }
    else {
      letterPause();
    }
  }
  digitalWrite(activeLed, LOW);
}

void loop() {
  digitalWrite(activeLed, LOW);
  String morseMessage;
  updateQueue();

  if (digitalRead(startButton) == HIGH) {
    morseMessage = fetchMessage();
    playMessage(morseMessage);
  }

  if (digitalRead(repeatButton) == HIGH) {
    playMessage(morseMessage);
  }
}
