package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Users;




public interface UsersRepo extends JpaRepository<Users,Long>{

}