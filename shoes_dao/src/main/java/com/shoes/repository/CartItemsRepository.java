package com.shoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoes.entity.CartItems;
import com.shoes.entity.Customer;

public interface CartItemsRepository extends JpaRepository<CartItems, Integer>{
	
	public List<CartItems> findByCustomerId(Customer customer);
	
}
