#include <ESP8266WiFi.h>
#include <FirebaseArduino.h>

// contacted to firebase
#define FIREBASE_HOST "morsemate-default-rtdb.europe-west1.firebasedatabase.app"
#define FIREBASE_AUTH "30Z1jSpRYtopqEzl83v8jh0k6fG0hRjErqOAHOBx"
// contacted to wifi router
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
  // print till seriell monitor
  Serial.print("connected: ");
  Serial.println(WiFi.localIP());
  // connect to firebase
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);
}

void loop() {
  String n;
  // set string value that take data from firebase
  n = Firebase.getString("nextMorseMessage");

  // handle error
  if (Firebase.failed()) {
    Serial.print("setting /number failed:");
    Serial.println(Firebase.error());
    // return;
  } else {
    // print till seriell monitor
    Serial.println(n);
  }
  delay(1000);
}
