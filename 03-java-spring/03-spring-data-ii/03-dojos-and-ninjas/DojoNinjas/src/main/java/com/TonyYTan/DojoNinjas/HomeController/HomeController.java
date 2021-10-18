package com.TonyYTan.DojoNinjas.HomeController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.TonyYTan.DojoNinjas.Service.DjService;
import com.TonyYTan.DojoNinjas.models.Dojo;
import com.TonyYTan.DojoNinjas.models.Ninja;

@Controller
public class HomeController {
	@Autowired
	private DjService djSer;
	
	//get to the mian page to show all the Dojo location
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("dojo") Dojo dojo) {
		model.addAttribute("dojos", this.djSer.findAllDojos());
		return "index.jsp";
	}
	
	//go to the page to add new dojo
	@GetMapping("/newdojo")
	public String newdojo(Model model, @ModelAttribute("dojo") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	
	//get to the dashborad to show all ninjas
	@GetMapping("/{dojo.getId()}")
	public String ninjaThisDojo(Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("ninjas", this.djSer.findAllNinjas());
		return "ninjalist.jsp";
	}
	
	
	//Post mapping for adding new Dojo
	@PostMapping("/addnewdojo")
	public String addNewDojo(Model model, @Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", this.djSer.findAllDojos());
			return "newdojo.jsp";
		}
		System.out.println("the New Dojo has been add!");
		return "/";
	}
}
