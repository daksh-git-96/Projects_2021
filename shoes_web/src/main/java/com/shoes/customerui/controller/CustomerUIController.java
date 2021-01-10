package com.shoes.customerui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
		return "customer/home";
	}
	
}
