package com.TonyYTan.theCode.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public String home(@RequestParam(value = "inputCode") String inputCode) {
		if(inputCode == "bushido") {
			return "redirect:/code.jsp";
		}
	}
}
