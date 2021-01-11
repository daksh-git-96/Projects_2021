package com.shoes.customerui.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoes.customer.service.CustomerAccountService;
import com.shoes.vo.CustomerVO;

@Controller
public class CustomerUIController {
	
	@Autowired
	private CustomerAccountService customerAccountService;
	
	@GetMapping(value = {"/","/home"})
	public String homePage() {
		return "customer/home";
	}
	
	@GetMapping("/customer/signUpPage")
	public String signUpPage(Model model) {
		//System.out.println("there::::::::::::::::::");
		CustomerVO customerVO = new CustomerVO();
		model.addAttribute("customerVO", customerVO);
		return "customer/customersignuppage";
	}
	
	@PostMapping("/customer/signUpPage")
	public String customerSignUpPage(@ModelAttribute CustomerVO customerVO, Model model) {
		customerAccountService.saveNewCustomerDetails(customerVO);
		model.addAttribute("message", "You have successfully created your account");
		return "customer/login";
	}
	
	@GetMapping("/customer/authenticationPage")
	public String loginPage(Model model) {
		CustomerVO customerVO = new CustomerVO();
		//System.out.println("HHHH");
		model.addAttribute("customerVO", customerVO);
		return "customer/login";
	}
	
	@PostMapping("/customer/authentication")
	public String authenticateUserCredentials(@ModelAttribute CustomerVO customerVO, Model model) {
		Map<String, Object> mapsData = customerAccountService.findUserByEmail(customerVO.getEmail(), customerVO.getPassword());
		if(mapsData.size()>0) {
			model.addAttribute("message", "Logged In");
			return "customer/dashboard";
		} else {
			model.addAttribute("message", "Wrong credentials, Please try again");
			return "customer/login";
		}
	}
	
}
