package com.TonyYTan.language.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TonyYTan.language.Service.langService;
import com.TonyYTan.language.models.Language;

@RestController
public class ApiContoller {
	private final langService langSer;

	public ApiContoller(langService langSer) {
		this.langSer = langSer;
	}

	// create a new language
	@PostMapping("/languages")
	public Language create(@RequestParam(value = "name") String name, @RequestParam("creator") String creator,
			@RequestParam(value = "currentVersion") float currentVersion) {
		Language lang = this.langSer.creatLang(name, creator, currentVersion);
		return lang;
	}

	// update a exist language
	@PutMapping("languages/{id}")
	public Language update(@PathVariable("id") Long id, @RequestParam(value = "name") String name,
			@RequestParam("creator") String creator, @RequestParam(value = "currentVersion") float currentVersion) {
		Language lang = this.langSer.updateLang(id, name, creator, currentVersion);
		return lang;
	}

	// delete a exist language
	@DeleteMapping("/delete/languages/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.langSer.deleteLang(id);
	}

}
