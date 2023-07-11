package com.gurwl.test.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson04/test01/")
public class SellerController {
	
	@GetMapping("1")
	public String sellerInput() {
		return "jsp/sellerInput";
	}
	
	@PostMapping("add_seller")
	public void addSeller() {
		
	}
}
