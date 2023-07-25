package com.gurwl.test.pension.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gurwl.test.pension.domain.Booking;
import com.gurwl.test.pension.service.PensionService;

@Controller
public class PensionController {
	
	@Autowired
	private PensionService pensionSerivce;
	
	@GetMapping("/pension/main")
	public String main() {
		return "pension/main";
	}
	
	@PostMapping("/pension/search/booking")
	@ResponseBody
	public Map<String, Object> searchBooking(
			@RequestParam("name") String name,
			@RequestParam("phoneNumber") String phoneNumber,
			Model model
	) {
		Booking booking = pensionSerivce.searchBooking(name, phoneNumber);
		
		Map<String, Object> result = new HashMap<>();
		if(booking == null) {
			//조회 실패
			result.put("result", "fail");
		} else {
			result.put("result", "success");
			result.put("info", booking);
		}
		
		return result;
	}
}
