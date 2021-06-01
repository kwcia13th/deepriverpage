package com.deep.river.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping(path = "/home")
	public String main() {
		return "index";
	}

}
