package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Address;

public interface AddressRepo extends JpaRepository <Address,Long>{

}