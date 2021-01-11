package com.shoes.adminui.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoes.admin.service.AdminAccountService;
import com.shoes.repository.AdminAccountRepository;
import com.shoes.vo.AdminVO;

@Controller
public class AdminUIController {
	
	@Autowired
	private AdminAccountService adminAccountService;
	
	@GetMapping("/admin/adminpage")
	public String adminHomePage() {
		return "admin/adminhome";
	}

	@GetMapping("/admin/signuppage")  
	public String adminSignupPage(Model model) {
		AdminVO adminVO = new AdminVO();
		model.addAttribute("adminVO", adminVO);
		return "admin/adminsignuppage";
	}
	
	@PostMapping("/admin/signupdetails")
	public String newAdminDetails(@ModelAttribute AdminVO adminVO, Model model) {
		adminAccountService.saveAdminDetails(adminVO);
		model.addAttribute("message","You have successfully registered as Admin");
		return "admin/adminhome";
	}
	
	@GetMapping("/admin/login")
	public String adminLoginPage(Model model) {
		AdminVO adminVO = new AdminVO();
		model.addAttribute("adminVO", adminVO);
		return "admin/login";
	}
	
	@PostMapping("/admin/adminauthentication") 
	public String adminLoginAuthenticator(@ModelAttribute AdminVO adminVO, Model model) {
		Map<String, Object> mapsData = adminAccountService.findAdminByEmail(adminVO.getEmail(), adminVO.getPassword());
		if(mapsData.size()>0) {
			model.addAttribute("message", "Logged In");
			return "admin/dashboard";
		} else {
			model.addAttribute("message", "Wrong credentials, Please try again");
			return "admin/login";
		}
	}
	
}
