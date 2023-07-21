package com.gurwl.test.ajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestFavoriteController {
	
	@Autowired
	
	
	@GetMapping("/test/ajax/favorite_input")
	public String favoriteInput() {
		return "ajax/favorite_input";
	}
	
	@GetMapping("/test/ajax/duplicate_check")
	public void duplicateCheck(@RequestParam("url") String url)
	{
		
	}
	
	@GetMapping("/test/ajax/favorite_add")
	public String favoriteAdd() {
		return "";
	}
}
