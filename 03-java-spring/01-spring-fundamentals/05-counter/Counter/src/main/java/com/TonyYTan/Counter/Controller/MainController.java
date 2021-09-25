package com.TonyYTan.Counter.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("")
	public String sessionIndex (HttpSession session ) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (Integer)session.getAttribute("count")+1);
		}
		return "index.jsp";
	}
	
	
	@RequestMapping("/counter")
	public String showCount (HttpSession session, Model model) {
		Integer currentSessionCount = (Integer)session.getAttribute("count");
		if(currentSessionCount == null) {
			model.addAttribute("countShow", 0);
		} else {
		model.addAttribute("countShow", currentSessionCount);
		}
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
		public String reet(HttpSession session) {
			session.setAttribute("count", 0);
			return "redirect:/counter";
		}
}
