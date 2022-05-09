//koppling till wifi "ESP8266WiFi.h" bord = Generic 8266 module
//SparkFun esp8266 thing
//9600

#include "ESP8266WiFi.h"

const char* ssid = "Enter SSID"; //Enter SSID
const char* password = "Enter Password"; //Enter Password

void setup(void)
{ 
  Serial.begin(115200);
  // Connect to WiFi
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) 
  {
     delay(500);
     Serial.print("*");
  }
  
  Serial.println("");
  Serial.println("WiFi connection Successful");
  Serial.print("The IP Address of ESP8266 Module is: ");
  Serial.print(WiFi.localIP());// Print the IP address
}

void loop() 
{
  // EMPTY
}
