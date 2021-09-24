package com.TonyYTan.DisplayDate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateControllers {
	private Date getdate() {
		Date now = new Date();
		return now;
	}
	
	@RequestMapping("")
	public String mainPage() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String datePage(Model viewModel) {
		viewModel.addAttribute("dateNow", getdate());
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String timePage(Model viewModel) {
		viewModel.addAttribute("timeNow",getdate());
		return "time.jsp";
	}
	
	
}
