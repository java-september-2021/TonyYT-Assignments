package com.TonyYTan.theCode.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/code", method = RequestMethod.POST)
	public String home(@RequestParam(value = "inputCode") String inputCode, Model viewModel, RedirectAttributes redirectAttr) {
		if(inputCode.equals("bushido")) {
			return "getin.jsp";
		} else {
			redirectAttr.addFlashAttribute("errorMessage", "You Must Train harder!");
			return "redirect:/";
		}
	}
}
