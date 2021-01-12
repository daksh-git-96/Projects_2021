package com.shoes.customer.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
	public Map<String, Object> findUserByEmail(String email, String password) {
		Optional<Customer> optional = customerAccountDetailsRepository.findByEmailAndPassword(email, password);
		Map<String, Object> mapsData = new HashMap<String, Object>();
		if(optional.isPresent()) {
			Customer customerEntity = optional.get();
			mapsData.put("email", customerEntity.getEmail());
			mapsData.put("password", customerEntity.getPassword());
		}
		return mapsData;
	}
	
	@Override
	public void saveNewCustomerDetails(CustomerVO customerVO) {
		Customer customerEntity = new Customer();
		customerVO.setDoe(new Timestamp(new Date().getTime()));
		BeanUtils.copyProperties(customerVO, customerEntity);
		customerAccountDetailsRepository.save(customerEntity);
	}
   
}
