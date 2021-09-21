package com.TonyYTan.Strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//1. Annotation
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	//1. Annotation
	@RequestMapping("/")
	// 3. Method that maps to the request route above
	public String greeting() {
		return "Hello Client！ how are yo udoing?"+'\n' +"Spring Boot is great! So easy to just respond with Strings!";
		
	}

}
