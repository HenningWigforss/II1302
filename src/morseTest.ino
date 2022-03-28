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
  // put your setup code here, to run once:
pinMode(redPin, OUTPUT);
pinMode(greenPin, OUTPUT);
pinMode(bluePin1, OUTPUT);
pinMode(bluePin2, OUTPUT);
pinMode(bluePin3, OUTPUT);
pinMode(bluePin4, OUTPUT);
pinMode(bluePin5, OUTPUT);
pinMode(speaker, OUTPUT);
}

void playDot(){
  tone(speaker, speakerFrequency); // Send 1KHz sound signal...
  digitalWrite(redPin, HIGH);   // sets the LED on
  delay(timeUnit);        // ...for 1 sec
  noTone(speaker);     // Stop sound...
  digitalWrite(redPin, LOW);    // sets the LED off
  delay(timeUnit);        // ...for 1sec
}

void playDash(){
  tone(speaker, speakerFrequency); // Send 1KHz sound signal...
  digitalWrite(redPin, HIGH);   // sets the LED on
  delay(3*timeUnit);        // ...for 1 sec
  noTone(speaker);     // Stop sound...
  digitalWrite(redPin, LOW);    // sets the LED off
  delay(timeUnit);        // ...for 1sec
}

void letterPause(){
  delay(2*timeUnit);  // An extra delay of 2 time units for each letter(2 since we already have a 1 time unit delay after each char)
}

void wordPause(){
  delay(4*timeUnit);  // An extra delay of 2 time units after each word (4 since we already have a 3 time unit delay after each letter)
}

String morseMessage[] = {"...","--","..."};

void loop() {
  for(int i = 0; i < sizeof(morseMessage); i++){
    for(int j = 0; j < sizeof(morseMessage[i]); j++){
      if(morseMessage[i][j] == '.'){
        playDot();
      }
    
      if(morseMessage[i][j] == '-'){
        playDash();
      }
    }
    letterPause();
  }
  wordPause();
}
