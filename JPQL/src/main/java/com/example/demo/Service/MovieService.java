package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.demo.Model.MovieModel;
import com.example.demo.Repository.MovieRepo;

@Service


public class MovieService {

	@Autowired
	@Lazy
	public MovieService aserv;
	
	@Autowired
	public MovieRepo hserv;
	
	//get all the data
		public List<MovieModel> getAllrows()
		{
			return hserv.getAllRows();
		}
		
		//get specific rows
		public List<MovieModel> getSpecrows(String add,String name)
		{
			return hserv.getSpecRows(add, name);
		}
	
	
}