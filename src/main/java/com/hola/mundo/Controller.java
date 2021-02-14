package com.hola.mundo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	@RequestMapping("/saludar")
	public String saludar() {
		return "hola mundo";
	}

}
