package com.goat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "Welcome to Die";
	}
	
	@GetMapping("/{name}")
	public String nameReq(@PathVariable("name") String name) {
		return ("Your name is " + name);
	}
}
