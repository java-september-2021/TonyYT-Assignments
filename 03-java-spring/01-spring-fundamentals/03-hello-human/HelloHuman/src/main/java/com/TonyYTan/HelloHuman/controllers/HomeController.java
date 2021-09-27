package com.TonyYTan.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
//@RequestMapping("")
//	public String greeting() {
//		return "Helle Human!";
//	}
//
//@RequestMapping("/{name}/{lastname}")
//	public String greetingName(@PathVariable("name") String theName, @PathVariable("lastname") String theLastName, Model model) {
//	model.addAttribute("greetingToWho", theName);
//	return "Hello " + theName + " "+theLastName;
//}

@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false, defaultValue = "Human") String name,@RequestParam(value = "lastName",required = false) String lastName, @RequestParam(value = "time", required = false) String times, Model viewModel){
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("lastName", lastName);
		viewModel.addAttribute("times", times);
		return "index.jsp";
	}

//@RequestMapping("/")
//	public String index(@RequestParam(value = "Lastname", required = false, defaultValue = "Human") String name, Model viewModel){
//	viewModel.addAttribute("name", name);
//	return "index.jsp";
//}
}