package com.shoes.cartitems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes.entity.CartItems;
import com.shoes.repository.CartItemsRepository;
import com.shoes.vo.CartItemsVO;
import com.shoes.vo.CustomerVO;

@Service
public class CartItemsServiceImpl implements CartItemsService {

	@Autowired
	private CartItemsRepository cartItemsRepository;
	
	public List<CartItemsVO> listCartItems(CustomerVO customerVO) {
		return cartItemsRepository.findByCustomerId(customerVO);
	}
	
}
