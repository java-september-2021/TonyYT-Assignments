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
		Integer sessionCount2 = (Integer)session.getAttribute("thisCount");
		if(currentSessionCount == null) {
			model.addAttribute("countShow", 0);
		} else {
		model.addAttribute("countShow", currentSessionCount);
		}
		
		if(sessionCount2 == null) {
			model.addAttribute("thisCount", 0);
		} else {
			model.addAttribute("thisCount", sessionCount2);
		}
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
		public String reet(HttpSession session) {
			session.setAttribute("count", 0);
			session.setAttribute("thisCount", 0);
			return "redirect:/counter";
		}
	
	@RequestMapping("/increment2")
	public String increTwo(HttpSession session) {
		if(session.getAttribute("thisCount" == null)){
			session.setAttribute("thisCount", 0);
		} else {
			session.setAttribute("thisCount", (Integer)session.getAttribute("count")+2);
		}
		return "increment2.jsp";
	}
}
