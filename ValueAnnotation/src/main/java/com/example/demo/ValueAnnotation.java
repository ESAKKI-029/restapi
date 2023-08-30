package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	
	@Value("29")
	public int regNum;
	@Value("Esakkiraj")
	public String name;
	
	@RequestMapping("/display")
	public String display()
	{
		return "My name is "+ name +" Reg number is " +regNum;
	}
}
