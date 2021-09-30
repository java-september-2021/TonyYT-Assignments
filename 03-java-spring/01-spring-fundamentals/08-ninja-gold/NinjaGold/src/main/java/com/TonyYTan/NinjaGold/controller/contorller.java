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
		} else {
			viewModel.addAttribute("goldNum", session.getAttribute("goldNum"));
		}
		
		ArrayList<String> actArray = new ArrayList<String>();
		if(session.getAttribute("activities")== null) {
			session.setAttribute("activities", actArray);
		}
		
		viewModel.addAttribute("activities", session.getAttribute("actArray"));
		return "index.jsp";
	}
	
	//@RequestMapping(value = "/gold", method = RequestMethod.POST)
	@PostMapping("/gold")
	public String findGold(@RequestParam("building") String building, HttpSession session) {
		Random r = new Random();
		int goldThisTurn = 0;
		if(building.equals("farm")) {
			goldThisTurn = r.nextInt((20 - 10) + 1) + 10;
		} else if(building.equals("cave")){
			goldThisTurn = r.nextInt((10 - 5) + 1) + 5;
		} else if(building.equals("house")){
			goldThisTurn = r.nextInt((5 - 2) + 1)+ 2;
		} else if(building.equals("casino")){
			goldThisTurn = r.nextInt((50 - (-50))+1) -50;
			System.out.println(goldThisTurn);
		} else {
			System.out.println("does not exist!");
		}
		int gold = (int)session.getAttribute("goldNum");
		int goldNum = gold += goldThisTurn;
		session.setAttribute("goldNum", goldNum);
		return "redirect:/";
	}

}
