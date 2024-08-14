package com.spring.crud.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class AppHealthCheck {
	@GetMapping("/ready")
	public String ready() {
		return "ok";
	}
}
