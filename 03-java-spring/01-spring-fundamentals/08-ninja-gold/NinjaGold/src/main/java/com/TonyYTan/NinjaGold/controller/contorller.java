package com.TonyYTan.NinjaGold.controller;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class contorller {
	@GetMapping("/")
	public String index(HttpSession session, Model viewModel) {
		if(session.getAttribute("goldNum") ==null) {
			session.setAttribute("goldNum", 0);
		} 
			
		ArrayList<String> activs = new ArrayList<String>();
		if(session.getAttribute("activities")== null) {
			session.setAttribute("activities", activs);
		}
		
		viewModel.addAttribute("goldNum", session.getAttribute("goldNum"));
		viewModel.addAttribute("activities", session.getAttribute("activities"));
		return "index.jsp";
	}
	
	//@RequestMapping(value = "/gold", method = RequestMethod.POST)
	@PostMapping("/gold")
	public String findGold(@RequestParam("building") String building, HttpSession session) {
		Random r = new Random();
		int goldThisTurn = 0;
		ArrayList<String> actArray = (ArrayList<String>) session.getAttribute("activities");
		if(building.equals("farm")) {
			goldThisTurn = r.nextInt((20 - 10) + 1) + 10;
			actArray.add(String.format("You entered a s% and earned d% gold ", building, goldThisTurn));
		} else if(building.equals("cave")){
			goldThisTurn = r.nextInt((10 - 5) + 1) + 5;
			actArray.add(String.format("You entered a s% and earned d% gold ", building, goldThisTurn));
		} else if(building.equals("house")){
			goldThisTurn = r.nextInt((5 - 2) + 1)+ 2;
			actArray.add(String.format("You entered a s% and earned d% gold ", building, goldThisTurn));
		} else if(building.equals("casino")){
			goldThisTurn = r.nextInt((50 - (-50))+1) -50;
			if(goldThisTurn < 0 ) {
				actArray.add(String.format("You entered a s% and lose d% gold ", building, goldThisTurn));
			} else {
				actArray.add(String.format("You entered a s% and earned d% gold ", building, goldThisTurn));
			}
		} else {
			System.out.println("does not exist!");
		}
		int gold = (int)session.getAttribute("goldNum");
		int goldNum = gold += goldThisTurn;
		session.setAttribute("goldNum", goldNum);
		session.setAttribute("activities", actArray);
		return "redirect:/";
	}

}
