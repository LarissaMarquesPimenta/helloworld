package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que o código abaixo será um controller ou um controlador da api
@RestController

//indica o endpoint da classe controladora
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping
	public String hello() {
		
		return "Ola mundo!";
		
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Mentalidade de Crescimento, persistencia, responsabilidade Pessoal, comunicação, orientação ao detalhe, orientação ao futuro, trabalho em equipe, proatividade.";
	}
	
	@GetMapping("/objetivos")
	public String objetivo() {
		return "Objetivos: 1. Trabalhar minha gestão de tempo, 2. Me organizar melhor, 3. Revisar os conteudos";
	}

}