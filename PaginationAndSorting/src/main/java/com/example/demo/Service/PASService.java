package com.example.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.PASModel;
import com.example.demo.Repo.PASRepo;

@Service
public class PASService {
	
	@Autowired
	public PASRepo arepo;
	
	//post the data
	public String savePAS(PASModel h)
	{
		arepo.save(h);
		return "Data is saved to database";
	}
	
	//get the data
	
	public List<PASModel> getPAS()
	{
		return arepo.findAll();
	}
	//sorting
		public List<PASModel>sortByAsc(String name)
		{
			return arepo.findAll(Sort.by(name).ascending());
		}
		//sorting
				public List<PASModel>sortByDes(String name)
				{
					return arepo.findAll(Sort.by(name).descending());
				}
				
				//pagination
				public List<PASModel>pagination(int pageNu,int pageSize)
				{
					Page<PASModel>cont=arepo.findAll(PageRequest.of(pageNu, pageSize));
					return cont.getContent();
				}
				//pagination and sorting
					public List<PASModel>paginationAndSorting(int pageNu,int pageSize,String name)
					{
						Page<PASModel>cont=arepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(name)));
						return cont.getContent();
					}
				
}