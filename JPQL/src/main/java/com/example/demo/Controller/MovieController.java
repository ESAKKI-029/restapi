package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.MovieModel;
import com.example.demo.Repository.MovieRepo;

@RestController
public class MovieController {
	
	@Autowired
	public MovieRepo arepo;
	
	@Autowired
	public MovieRepo hrepo;
	
	//get all the data
	
		 @GetMapping("/getAllrows")
		 public List<MovieModel> getallRows()
		 {
			 return hrepo.getAllRows();
		 }
		 
		 //get specific data
		 
		 @GetMapping("/getSpecific/{add}/{name}")
		 public List<MovieModel> getSpec(@PathVariable("add") String add,@PathVariable("name") String name)
		 {
			 return hrepo.getSpecRows(add, name);
		 }
		 
	
}