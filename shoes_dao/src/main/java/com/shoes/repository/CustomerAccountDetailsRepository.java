package com.shoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoes.entity.Customer;

public interface CustomerAccountDetailsRepository extends JpaRepository<Customer, Integer>{

}
