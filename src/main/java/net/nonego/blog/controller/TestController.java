package net.nonego.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("user", "test");
		return "test/index";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "helo world";
	}
	
	@RequestMapping("layout")
	public String testLayout() {
		return "test/layout";
	}

	@RequestMapping("layout/test")
	public String testLayout2() {
		return "test/layouttest";
	}
}
