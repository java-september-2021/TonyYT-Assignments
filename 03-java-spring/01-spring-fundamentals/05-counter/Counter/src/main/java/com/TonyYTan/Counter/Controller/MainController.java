package com.TonyYTan.Counter.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	public String sessionIndex (HttpSession session ) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (Integer)session.getAttribute("count")+1);
		}
		return "index.jsp";
	}
	
	public String showCount (HttpSession session, Model model) {
		Integer currentSessionCount = (Integer)session.getAttribute("count");
		model.addAttribute("countShow", currentSessionCount);
		return "counter.jsp";
	}
	
	@RequestMapping("")
	public String home() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/counter")
	public String counter() {
		
		return "counter.jsp";
	}
	
}
