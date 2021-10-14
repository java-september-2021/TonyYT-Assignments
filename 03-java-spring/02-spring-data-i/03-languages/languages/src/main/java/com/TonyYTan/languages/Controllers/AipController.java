package com.TonyYTan.languages.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TonYTan.languages.model.Language;
import com.TonyYTan.languages.service.LangService;

@RestController
public class AipController {
	private final LangService LangSer;
	
	public AipController(LangService langSer) {
		this.LangSer = langSer;
	}

	//create a new language
	@PostMapping ("/languages")
	public Language creat (@RequestParam(value = "name") String name, @RequestParam("creator") String creator, @RequestParam(value = "currentVersion") float currentVersion) {
		//add/create a language to the database
		Language lang = new Language (name, creator, currentVersion);
		return this.LangSer.createLang(lang);
	}
	
	
	//update a exist language
	@PutMapping ("language/{id}")
	public Language update(@PathVariable("id") Long id, @RequestParam(value = "name") String name, @RequestParam("creator") String creator, @RequestParam(value = "currentVersion") float currentVersion) {
		Language lang = this.LangSer.updateLang(id, name, creator, currentVersion);
		return lang;
	}
}
