package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.MovieModel;

import jakarta.transaction.Transactional;


public interface MovieRepo extends JpaRepository<MovieModel, Integer>{
	//native Query
	
			@Query(value="select * from moviemodel", nativeQuery = true)
			public List<MovieModel> getAllRows();
			
			@Query(value="select * from moviemodel where address=:addr and moviename=:name",nativeQuery = true )
			public List<MovieModel> getSpecRows(@Param("addr") String addr,@Param("name") String name);
			
			//Delete using native query
			@Modifying
			@Transactional
			@Query(value="delete from moviesmodel where movie_id=:id",nativeQuery = true)
			public int deletedId(@Param("id")int id);
			
			//update the native query
			@Modifying
			@Transactional
			@Query(value="update moviesmodel set destination=:dest where movies_id=:id",nativeQuery = true)
			public Integer updateByid(@Param("dest")String dest,@Param("id")int id);

}
