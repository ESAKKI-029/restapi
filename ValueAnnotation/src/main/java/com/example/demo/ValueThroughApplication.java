package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ValueThroughApplication {
	
	@Value(value="${myName}")
	public String studentName;
	
	@Value(value="${age:20}")
	public int age;
	
	@GetMapping("/student")
	public String displayStudent()
				{
			return "My name is "+studentName+" Age is " +age;
				}
	

}