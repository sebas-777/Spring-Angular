package com.tutorial.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutorial.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "/index", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola pendejos");
		return "index";
	}

	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Andres");
		usuario.setApellidos("pendejo");
		usuario.setEmail("andres@correo.com");
		model.addAttribute("usuarios", usuario);
		model.addAttribute("titulo", "perfilde usuario".concat(usuario.getNombre()));
		return "perfil";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Andres", "Guzman", "email@email.com"),
				new Usuario("Camilo", "Teo", "teo@email.com"), new Usuario("Isabella", "Torrez", "Torrez@email.com"));

		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", "Usuarios");
		return "listar";
	}

}
