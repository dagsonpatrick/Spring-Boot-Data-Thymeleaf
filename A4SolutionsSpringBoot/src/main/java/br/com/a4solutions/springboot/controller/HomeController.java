/**
 * 
 */
package br.com.a4solutions.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Dagson Souza
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView resultado = new ModelAndView("home/home");
		return resultado;
	}
}
