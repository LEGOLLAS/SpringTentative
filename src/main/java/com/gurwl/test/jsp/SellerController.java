package com.gurwl.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gurwl.test.jsp.domain.Seller;
import com.gurwl.test.jsp.service.SellerService;

@Controller
@RequestMapping("/lesson04/test01/")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping("1")
	public String sellerInput() {
		return "jsp/sellerInput";
	}
	
	@PostMapping("add_seller")
	@ResponseBody
	public String addSeller(
			@RequestParam("name") String name,
			@RequestParam("imgUrl") String imgUrl,
			@RequestParam("temperature") double temperature
			) {
		int count = sellerService.addSeller(name, imgUrl, temperature);
		
		return "삽입 갯수 : " + count;
	}
	
	@GetMapping("seller_info")
	//Integer 객체도 저장가능하고 int도 저장가능한 wrapper클래스
	public String getSellerLast(
			@RequestParam(required=false, value="id") Integer id, 
			Model model
		) {
		
		Seller seller = null;
		
		if(id == null ) {
			seller  = sellerService.getSeller();
		}else {
			seller  = sellerService.getSellerLast(id);
		}
		
		model.addAttribute("result", seller);
		
		return "jsp/sellerInfo";
	}
	
}
