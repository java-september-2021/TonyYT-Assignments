package com.TonyYTan.DisplayDate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateControllers {
	@RequestMapping("")
	public String mainPage() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String datePage() {
		new java.util.Date();
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String timePage() {
		return "time.jsp";
	}
}
