package com.shoes.customer.service;

import java.util.Map;

import com.shoes.vo.CustomerVO;

public interface CustomerAccountService {

	public void saveNewCustomerDetails(CustomerVO customerVO);

	Map<String, Object> findUserByEmail(String email, String password);

}
