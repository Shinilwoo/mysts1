package com.example.sts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String get() {
		return "hello my site";
	}
	
	@GetMapping("/greeting")
	public String mygreet() {
		return "나의 사이트에 오신걸 환영합니다";
	}
}
