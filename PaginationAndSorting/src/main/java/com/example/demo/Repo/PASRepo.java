package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.PASModel;


public interface PASRepo extends JpaRepository<PASModel, Integer>{

}
