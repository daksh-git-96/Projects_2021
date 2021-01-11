package com.shoes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoes.entity.Customer;

public interface CustomerAccountDetailsRepository extends JpaRepository<Customer, Integer>{
	
	public Optional<Customer> findByEmailAndPassword(String email, String password);
	
}
