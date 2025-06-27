package com.tutorial.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
	
	
	@RequestMapping("/")
	public String listarVideoJuegoString() {
		return "index";
	}
}
