package com.example.demo.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Petrolbunk;

public interface FuelRepo extends JpaRepository<Petrolbunk, Integer>{

}
