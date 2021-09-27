package com.TonyYTan.NinjaGold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class contorller {
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String index(@RequestParam(value= "farmGold", required = false) String farmGold, @RequestParam(value = "caveGold", required = false) String caveGold, @RequestParam(value = "houseGold", required = false) String houseGold, @RequestParam(value="casinoGold", required = false) String casinoGold, @RequestParam(value = "goldCount", required = false, defaultValue = "0") int goldCount, Model viewModel) {
		viewModel.addAttribute("goldCount",goldCount);
		return "index.jsp";
	}
}
