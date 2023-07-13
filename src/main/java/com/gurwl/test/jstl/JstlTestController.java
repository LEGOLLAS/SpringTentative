package com.gurwl.test.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JstlTestController {
	
	@GetMapping("/jstl/test1")
	public String test01() {
		return "jstl/test01";
	}
	
}
