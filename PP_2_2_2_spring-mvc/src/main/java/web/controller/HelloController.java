package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {

		List<String> messages = new ArrayList<>();
		messages.add("Привет!");
		messages.add("Это приложение Spring MVC приложение");
		model.addAttribute("messages", messages);
		return "index";
	}

	
}