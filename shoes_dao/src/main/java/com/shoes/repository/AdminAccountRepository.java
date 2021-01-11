package com.shoes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoes.entity.Admin;
import com.shoes.entity.Customer;
public interface AdminAccountRepository extends JpaRepository<Admin, Integer>{

	public Optional<Admin> findByEmailAndPassword(String email, String password);
	
}
