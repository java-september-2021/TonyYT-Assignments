package com.TonyYTan.language.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.TonyYTan.language.Service.langService;
import com.TonyYTan.language.models.Language;

@Controller
public class HomeController {
	public final langService langSer;

	public HomeController(langService langSer) {
		this.langSer = langSer;
	}

	@GetMapping("/languages")
	public String index(Model model, @ModelAttribute("language") Language lang) {
		model.addAttribute("allLanguages", this.langSer.allLanguages());
		return "index.jsp";
	}
//	
//	@PostMapping ("/languages")
//	public String creatLang () {
//		//add/create a language to the database
//		return "redirect:/languages";
//	}

	@GetMapping("/languages/{id}")
	public String displayLang(@PathVariable("id") Long id) {
		return "display.jsp";
	}

	@GetMapping("/languages/{id}/edit")
	public String editLang(@PathVariable("id") Long id) {
		return "edit.jsp";
	}

//	@PutMapping ("language/{id}")
//	public String updateLang(@PathVariable("id") Long id, @RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("currentVersion") float currentVersion) {
//		
//	}
}
