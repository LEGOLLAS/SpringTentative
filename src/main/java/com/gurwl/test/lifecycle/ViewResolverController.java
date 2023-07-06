package com.gurwl.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewResolverController {
	
	@RequestMapping("/lifecycle/test02")
	public String viewresolver() {
		return "lifecycle/test03";
	}
}
