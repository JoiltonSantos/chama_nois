package com.chamanois.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotasController {
	
	@GetMapping("/")
	public String home() { 
		return "pages/index";
	}
	
	@GetMapping("/login")
	public String login() { 
		return "pages/entrar";
	}
}
