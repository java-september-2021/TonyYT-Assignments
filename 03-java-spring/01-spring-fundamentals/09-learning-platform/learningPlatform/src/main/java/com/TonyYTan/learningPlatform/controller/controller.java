package com.TonyYTan.learningPlatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping ("/m/{chapter}/{fileType}/{assignmentNumber}")
	public String form(@PathVariable String chapter, @PathVariable String assignmentNumber, @PathVariable String fileType) {
		if(fileType.equals("0553")) {
			return "lession.jsp";
		} else if (fileType.equals("0483")) {
			return "assignment.jsp";
		} else if (fileType.equals("0000")) {
			return "quiz.jsp";
		}
		
		return "index.jsp";
	}
}
