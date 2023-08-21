package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Petrolbunk;
import com.example.demo.reporitory.FuelRepo;


@Service
public class FuelService {
	@Autowired
	public FuelRepo frepo;
	
	//post the data
	public Petrolbunk saveDetails(Petrolbunk p)
	{
		return frepo.save(p);
	}
	
	//get the data
	public List<Petrolbunk> getDetails()
	{
		return frepo.findAll();
	}
    
}
