#include <ESP8266WiFi.h>
#include <dummy.h>
// firebase
#define FIREBASE_HOST "esp8266-4b1c8.appspot.com"
#define FIREBASE_AUTH "gvPCjk3g7Nni5T0tkXTeC2ol1KI3kaea9zaFi0hd"
// contact to Internet Router
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
}

void loop() {
  // EMPTY
}