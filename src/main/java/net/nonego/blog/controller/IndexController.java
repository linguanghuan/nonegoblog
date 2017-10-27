package net.nonego.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	@RequestMapping("/base")
	public String base(Model model) {
		model.addAttribute("user", "test");
		return "base";
	}
}
