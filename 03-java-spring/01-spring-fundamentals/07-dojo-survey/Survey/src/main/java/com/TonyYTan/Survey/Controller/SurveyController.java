package com.TonyYTan.Survey.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/result")
	public String result(@RequestParam(value = "name") String name,@RequestParam(value = "locationSelect") String DoJoLocation, @RequestParam(value = "language") String language, @RequestParam(value= "comment") String comment, Model viewModel) {
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("DojoLocation", DoJoLocation);
		viewModel.addAttribute("comment", comment);
		viewModel.addAttribute("language",language);
		return "/result.jsp";
	}
}
