package com.TonyYTan.driverLicense.Contoller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TonyYTan.driverLicense.Service.DMVService;
import com.TonyYTan.driverLicense.models.License;
import com.TonyYTan.driverLicense.models.Person;

@Controller
public class HomeComtroller {
	@Autowired
	private DMVService dService;
	
	@RequestMapping("/")
	public String index (Model model) {
		model.addAttribute("persons", this.dService.getAllPeople());
		return "index.jsp";
	}
	
	@GetMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "new.jsp";
	}
	
	@PostMapping("/new")
	public String processPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.dService.createPerson(person);
		return "redirect:/";
	}
	  
	@GetMapping("/licenses/create")
	public String createLicense(Model model, @ModelAttribute("license") License license) {
		model.addAttribute("people",this.dService.getUnlicensedPeople());
		return "newlicense.jsp";
	}
	
	
	@PostMapping("/newlicense")
	public String processLicense(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("people",this.dService.getUnlicensedPeople());
			return "newlicense.jsp";
		}
		this.dService.createLicense(license);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("person", this.dService.getOnePerson(id));
		return "show.jsp";
	}
}
