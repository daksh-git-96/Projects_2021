package com.shoes.admin.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes.entity.Admin;
import com.shoes.repository.AdminAccountRepository;
import com.shoes.vo.AdminVO;

@Service
@Transactional
public class AdminAccountServiceImpl implements AdminAccountService {
	//
	@Autowired
	private AdminAccountRepository adminAccountRepository;
	
	@Override
	public void saveAdminDetails(AdminVO adminVO) {
		Admin adminEntity = new Admin();
		BeanUtils.copyProperties(adminVO, adminEntity);
		adminAccountRepository.save(adminEntity);
	}
	
	@Override
	public Map<String, Object> findAdminByEmail(String email, String password) {
		Optional<Admin> optional = adminAccountRepository.findByEmailAndPassword(email, password);
		Map<String, Object> mapsData = new HashMap<String, Object>();
		if(optional.isPresent()) {
			Admin adminEntity = optional.get();
			mapsData.put("email", adminEntity.getEmail());
			mapsData.put("password", adminEntity.getPassword());
		}
		return mapsData;
	}
	
}
