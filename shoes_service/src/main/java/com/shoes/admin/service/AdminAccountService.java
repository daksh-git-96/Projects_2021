package com.shoes.admin.service;

import java.util.Map;

import com.shoes.vo.AdminVO;

public interface AdminAccountService {

	public void saveAdminDetails(AdminVO adminVO);

	public Map<String, Object> findAdminByEmail(String email, String password);

}
