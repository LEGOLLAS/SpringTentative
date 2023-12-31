package com.gurwl.test.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gurwl.test.jpa.domain.Company;
import com.gurwl.test.jpa.service.CompanyService;

@Controller	
public class JpaTest01Controller {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/jpa/test/01")
	@ResponseBody
	public List<Company> addCompany() {
		List<Company> companyList = new ArrayList<>();
		Company company = companyService.addCompany("버블팡", "여신 금융업", "대기업", 6834);
		companyList.add(company);
		
		Company company2 = companyService.addCompany("버블팡", "여신 금융업", "대기업", 6834);
		companyList.add(company2);
		
		return companyList;
	}
	
	
	@GetMapping("/jpa/test/02")
	@ResponseBody
	public Company updateCompany() {
		return companyService.updateCompany(9, "중소기업", 34);
	}
	
	@GetMapping("/jpa/test/03")
	@ResponseBody
	public void deleteCompany() {
		companyService.deleteCompany(9);
	}
}
