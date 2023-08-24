package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.PASModel;
import com.example.demo.Service.PASService;

@RestController
public class PASController {

	@Autowired
	public PASService aserv;
	
	//post mapping
	
	@PostMapping("/postAdoption")
	public String postAdoption(@RequestBody PASModel hr)
	{
		aserv.savePAS(hr);
		return "Data is saved to the Database";
	}
	
	//get mapping
	
	@GetMapping("/getAdoption")
	public List<PASModel> getPASInfo()
	{
		return aserv.getPAS();
	}
	
	//sort by asc
		@GetMapping("/sortAsc/{name}")
		public List<PASModel>sortasc(@PathVariable("name")String name)
		{
			return aserv.sortByAsc(name);
		}
		
		//sort by des
				@GetMapping("/sortDes/{name}")
				public List<PASModel>sortdes(@PathVariable("name")String name)
				{
					return aserv.sortByDes(name);
				}
				
				//pagination
				@GetMapping("/pagination/{num}/{size}")
				public List<PASModel>paginationEx(@PathVariable("num")int num,@PathVariable("size")int size)
				{
					return aserv.pagination(num,size);
				}
				
				//pagination and sorting
					@GetMapping("/paginationAnsSorting/{num}/{size}/{name}")
					public List<PASModel>paginationAndSortingEx(@PathVariable("num")int num,@PathVariable("size")int size,@PathVariable("name")String name)
					
					{
						return aserv.paginationAndSorting(num,size,name);
					}
}