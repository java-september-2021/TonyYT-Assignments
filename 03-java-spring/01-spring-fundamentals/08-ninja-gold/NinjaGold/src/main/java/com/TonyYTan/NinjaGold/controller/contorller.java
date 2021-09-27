package com.TonyYTan.NinjaGold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class contorller {
	@RequestMapping("/gold")
	public String index(@RequestParam(value= "farmGold") String farmGold, @RequestParam(value = "caveGold") String caveGold, @RequestParam(value = "houseGold") String houseGold, @RequestParam(value="casinoGold") String casinoGold, Model viewModel) {
		
		return "index.jsp";
	}
}
