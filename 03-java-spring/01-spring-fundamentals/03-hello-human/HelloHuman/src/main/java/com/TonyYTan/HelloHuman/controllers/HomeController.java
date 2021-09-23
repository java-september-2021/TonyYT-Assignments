package com.TonyYTan.HelloHuman.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("")
	public String greeting() {
		return "Helle Human!";
	}

@RequestMapping("/{name}/{lastname}")
	public String greetingName(@PathVariable("name") String theName, @PathVariable("lastname") String theLastName, Model model) {
	model.addAttribute("greetingToWho", theName);
	return "Hello " + theName + " "+theLastName;
}
}