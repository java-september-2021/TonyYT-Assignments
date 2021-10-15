package com.TonyYTan.language.Controllers;

//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


	// create a new language
	@PostMapping("/languages")
	public String create(@RequestParam(value = "name") String name, @RequestParam("creator") String creator,
			@RequestParam(value = "currentVersion") float currentVersion, @ModelAttribute("language") Language lang, BindingResult result, Model model) {
		if(result.hasErrors()) {
		model.addAttribute("allLanguages", this.langSer.allLanguages());
		return "index.jsp";			
	}
		this.langSer.createLang(name, creator, currentVersion);
		return "redirect:/languages";
	}
	
	//create a new language from Matt S video
//	@PostMapping("/languages")
//	public String create(@Validated @ModelAttribute("language") Language lang, BindingResult result, Model model) {
//		if(result.hasErrors()) {
//			model.addAttribute("allLanguages", this.langSer.allLanguages());
//			return "index.jsp";			
//		}
//		this.langSer.createLang(lang);
//		return "redirect:/languages";
//	}

	
	@GetMapping("/display/languages/{id}")
	public String displayLang(@PathVariable("id") Long id, Model model) {
		model.addAttribute("thisLang", this.langSer.find(id));
		return "display.jsp";
	}
	

	@GetMapping("/languages/{id}/edit")
	public String editLang(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", this.langSer.find(id));
		return "edit.jsp";
	}
	

	// update a exist language
	@PutMapping("languages/{id}/edit")
	public String update(@Validated @ModelAttribute("language") Language lang, BindingResult result, Model model, @PathVariable("id") Long id, @RequestParam(value = "name") String name,
			@RequestParam("creator") String creator, @RequestParam(value = "currentVersion") float currentVersion) {
		if(result.hasErrors()) {
		model.addAttribute("language", this.langSer.find(id));
		return "edit.jsp";
	}
		this.langSer.updateLang(id, name, creator, currentVersion);
		return "redirect:/languages";
	}
	

	// delete a exist language
	@GetMapping("/delete/languages/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.langSer.deleteLang(id);
		return "redirect:/languages";
	}

	
	
//	@PutMapping("/languages/{id}/edit")
//	public String edit(@Valid, @ModelAttribute("language") Language language, BindingResult result, Model model, @PathVariable("id") Long id) {
//		if(result.hasErrors()) {
//			model.addAttribute("language", this.langSer.find(id));
//			return "edit.jsp";
//		}
//		this.langSer.updateLang(id, name, creator, 0);
//	}
//	

}