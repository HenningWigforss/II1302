int redPin = 2;
int greenPin = 3;
int bluePin1 = 4;
int bluePin2 = 5;
int bluePin3 = 6;
int bluePin4 = 7;
int bluePin5 = 8;
int speaker = 9;
int speakerFrequency = 880;
int timeUnit = 150;

void setup() {
  pinMode(redPin, OUTPUT);
  pinMode(greenPin, OUTPUT);
  pinMode(bluePin1, OUTPUT);
  pinMode(bluePin2, OUTPUT);
  pinMode(bluePin3, OUTPUT);
  pinMode(bluePin4, OUTPUT);
  pinMode(bluePin5, OUTPUT);
  pinMode(speaker, OUTPUT);
}

void playDot() {
  tone(speaker, speakerFrequency);
  digitalWrite(redPin, HIGH);
  delay(timeUnit);
  noTone(speaker);
  digitalWrite(redPin, LOW);
  delay(timeUnit);
}

void playDash() {
  tone(speaker, speakerFrequency);
  digitalWrite(redPin, HIGH);
  delay(3 * timeUnit);
  noTone(speaker);
  digitalWrite(redPin, LOW);
  delay(timeUnit);
}

void letterPause() {
  delay(2 * timeUnit); // An extra delay of 2 time units for each letter(2 since we already have a 1 time unit delay after each char)
}

void wordPause() {
  delay(4 * timeUnit); // An extra delay of 2 time units after each word (4 since we already have a 3 time unit delay after each letter)
}

String morseAlphabet(char letter) {
  letter = tolower(letter);
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

  for (auto i : alphabet) {
    if (i[0][0] == letter)
      return i[1];
  }
}

String translateMorse(String message){
  String morseMessage = "";
  for(auto i : message){
    morseMessage += morseAlphabet(i);
  }
  return morseMessage;
}

void loop() {
  String message = "Arbeta Agilt";
  String morseMessage = translateMorse(message);

  for (auto i : morseMessage) {
    if (i == '.') {
      playDot();
    }
    else if (i == '-') {
      playDash();
    }
    else if (i == ' ') {
      letterPause();
    }
    else if (i == ',') {
      wordPause();
    }
  }
}
