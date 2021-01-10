package com.shoes.customer.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes.entity.Customer;
import com.shoes.repository.CustomerAccountDetailsRepository;
import com.shoes.vo.CustomerVO;

@Service
@Transactional
public class CustomerAccountServiceImpl implements CustomerAccountService {
	
	@Autowired
	private CustomerAccountDetailsRepository customerAccountDetailsRepository;
	
	@Override
	public void saveNewCustomerDetails(CustomerVO customerVO) {
		Customer customerEntity = new Customer();
		customerEntity.setDoe(customerVO.getDoe());
		BeanUtils.copyProperties(customerVO, customerEntity);
		customerAccountDetailsRepository.save(customerEntity);
	}
	
}
