package com.TonyYTan.languages.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping ("/languages")
	public String index() {
		return "index.jsp";
	}
//	
//	@PostMapping ("/languages")
//	public String creatLang () {
//		//add/create a language to the database
//		return "redirect:/languages";
//	}
	
	@GetMapping ("languages/{id}")
	public String displayLang(@PathVariable("id") Long id) {
		return "display.jsp";
	}
	
	@GetMapping ("language/{id}/edit")
	public String editLang(@PathVariable("id") Long id) {
		return "edit.jsp";
	}
	
//	@PutMapping ("language/{id}")
//	public String updateLang(@PathVariable("id") Long id, @RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("currentVersion") float currentVersion) {
//		
//	}
}
