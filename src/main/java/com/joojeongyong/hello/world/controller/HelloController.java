package com.joojeongyong.hello.world.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RequestMapping("/hello")
@RestController
public class HelloController {
	
	@GetMapping
	public String hello(@RequestParam String name) {
		return "hello, World!".replace("World", name);
	}
}
