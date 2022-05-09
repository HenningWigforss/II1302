package dev.BackEnd;

import BackEnd.Utility.MorseTranslator;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8080/")
public class HelloController {

	@GetMapping("/dead")
	public String index() {
		return "Greetings from Spring Boots!";
	}

	@GetMapping("/translateMorse")
	public String translateMorse(String msg){
		MorseTranslator mt = new MorseTranslator();
		return mt.translateString(msg);
	}
}