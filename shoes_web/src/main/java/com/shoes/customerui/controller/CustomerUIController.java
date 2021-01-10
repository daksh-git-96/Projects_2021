package com.shoes.customerui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoes.customer.service.CustomerAccountService;
import com.shoes.vo.CustomerVO;

@Controller
public class CustomerUIController {
	
	@Autowired
	private CustomerAccountService customerAccountService;
	
	@GetMapping(value = {"/","/home"})
	public String homePage(Model model) {
		CustomerVO customerVO = new CustomerVO();
		model.addAttribute("customerVO", customerVO);
		return "customer/home";
	}
	
}
