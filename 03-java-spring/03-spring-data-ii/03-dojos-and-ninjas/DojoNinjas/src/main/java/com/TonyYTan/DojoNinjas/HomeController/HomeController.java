package com.TonyYTan.DojoNinjas.HomeController;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/dojo/{id}")
	public String ninjaThisDojo(Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("ninjas", this.djSer.findAllNinjas());
		return "ninjalist.jsp";
	}
	
	
	//Post mapping for adding new Dojo
	@PostMapping("/addnewdojo")
	public String addNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			//model.addAttribute("dojos", this.djSer.findAllDojos());
			return "newdojo.jsp";
		}
		this.djSer.newDojo(dojo);
		return "/";
	}
	
	
	//delete Dojo by id
	@GetMapping("/deletedojo/{id}")
	public String deletedojo(@PathVariable ("id") Long id) {
		this.djSer.deleteDojo(id);
		return "redirect:/";
	}
	
	
	//get to page to add new ninja
	@GetMapping("/newninja")
	public String newninjapage(Model model, @ModelAttribute("ninja") Ninja ninja) {
		//model.addAttribute("ninjas",this.djSer.findAllNinjas());
		model.addAttribute("dojos",this.djSer.findAllDojos());
		return "newninja.jsp";
	}
	
	//create a new Ninja to Dojo
	@PostMapping("/ninjatoadd")
	public String newninjaadd(Model model, @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/newninja";
		}
		this.djSer.newNinja(ninja);
		return "redirect:/ninjatotallist";
	}
	
	//get to the ninja list of the specific dojo location
	@GetMapping("/ninjalist/{id}")
	public String ninjalist(@PathVariable("id") Long id, @Valid @ModelAttribute("ninjas") Ninja ninja, BindingResult result, Model model) {
		model.addAttribute("dojoDetail", this.djSer.findDojo(id));
		return "ninjalist.jsp";
	}
	
	
	@GetMapping("/ninjatotallist")
	public String ninjaTotalList(Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("ninjas", this.djSer.findAllNinjas());
		return "totalninja.jsp";
	}
	
	@GetMapping("/deleteninja/{id}")
	public String deleteninja(@PathVariable Long id) {
		this.djSer.deleteThisNinja(id);
		return "redirect:/ninjatotallist";
	}
	
	
}
