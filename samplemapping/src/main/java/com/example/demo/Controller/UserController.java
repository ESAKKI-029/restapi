package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Users;
import com.example.demo.repository.UsersRepo;


@RestController
@RequestMapping("/")
public class UserController 
{
	@Autowired
	UsersRepo srepo;
	@PostMapping("/add")
		public Users saveDetails(@RequestBody Users aj)
		{
			return  srepo.save(aj);
		}
	@GetMapping("/getall")
	public List<Users>getDetails()
	{
		return srepo.findAll();
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id")int id)
	{
		srepo.deleteById((long) id);
		
		
		return "The id "+id+" is deleted";
	}
	
}