#include <ESP8266WiFi.h>
#include <FirebaseArduino.h>

// Set these to run example.
#define FIREBASE_HOST "morsemate-default-rtdb.europe-west1.firebasedatabase.app"
#define FIREBASE_AUTH "30Z1jSpRYtopqEzl83v8jh0k6fG0hRjErqOAHOBx"
#define WIFI_SSID "murtadhas-iPhone"
#define WIFI_PASSWORD "murtadha"


void setup() {
  Serial.begin(9600);

  // connect to wifi.
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
  Serial.print("connecting");
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }
  Serial.println();
  Serial.print("connected: ");
  Serial.println(WiFi.localIP());

  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);
}

void loop() {
  
  // set value (first code)
  //String temp = Firebase.getString("nextPlainMessage");
  //last coden
  String temp = Firebase.getString("nextMorseMessage");

  int length = sizeof(temp);
  char n[length];
  int i = 0;
  //read all string from fierbase
  while (temp[i] != 0) {
    n[i] = temp[i];
    i++;
  }
  
  // handle error
  if (Firebase.failed()) {
    Serial.print("setting /number failed:");
    Serial.println(Firebase.error());
    return;
  } else
  {
    Serial.println(n);
    //Serial.write(n);
  }
  delay(1000);
}
