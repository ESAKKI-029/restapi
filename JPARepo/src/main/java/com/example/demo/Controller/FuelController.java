package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Petrolbunk;
import com.example.demo.service.FuelService;

@RestController
public class FuelController {
	
	@Autowired
	FuelService fser;
	@PostMapping("/saveFuel")
	
    public Petrolbunk saveFuelStationDe(@RequestBody Petrolbunk pb)
    {
		return fser.saveDetails(pb);
    }
	@GetMapping("/getFuel")
	public List<Petrolbunk> getFuelStationDe()
	{
		return fser.getDetails();
	}
}
