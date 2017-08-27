package net.nonego.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.nonego.blog.pojo.Greeting;

@RestController
public class TestRestController {
	@RequestMapping("/greeting")
	public Greeting greeting() {
		return new Greeting(1, "test");
	}
}
