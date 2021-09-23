package com.TonyYTan.Routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("{part1}")
	public String dojo(@PathVariable("part1") String dojo) {
		return "The dojo is awesome!";
	}
}
