package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WELCOME {
@GetMapping("sh")
public String Welcome()
{
	return "Welcome String Boot!";
}
}