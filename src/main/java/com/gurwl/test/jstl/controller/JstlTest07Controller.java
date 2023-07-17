package com.gurwl.test.jstl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JstlTest07Controller {
	@GetMapping("/jstl/test07")
	public String test07() {
		return "jstl/test07";
	}
}
