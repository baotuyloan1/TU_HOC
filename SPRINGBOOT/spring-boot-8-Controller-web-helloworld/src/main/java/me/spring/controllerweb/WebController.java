package me.spring.controllerweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/hello")
	 // Request param "name" sẽ được gán giá trị vào biến String
	public String hello(@RequestParam(name = "nameBao", required = false, defaultValue = "") String name1, Model model) {
		model.addAttribute("name2",name1);
		return "hello";

	}
}
