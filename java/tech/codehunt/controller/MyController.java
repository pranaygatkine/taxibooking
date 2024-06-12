package tech.codehunt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
@GetMapping (path={"","home","welcome","index"})
	public String welcomeView() {
		return "index";		
	}
}
