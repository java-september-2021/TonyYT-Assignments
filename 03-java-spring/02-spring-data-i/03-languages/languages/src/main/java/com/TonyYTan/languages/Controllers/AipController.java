package com.TonyYTan.languages.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TonYTan.languages.model.Language;

@RestController
public class AipController {
	private final 
	
	
	//create a new language
	@PostMapping ("/languages")
	public Language creatLang () {
		//add/create a language to the database
		return Language;
	}
	
	
	//update a exist language
	@PutMapping ("language/{id}")
	public Language updateLang(@PathVariable("id") Long id, @RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("currentVersion") float currentVersion) {
		
	}
}
