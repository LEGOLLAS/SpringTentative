package com.gurwl.test.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gurwl.test.jpa.domain.Recruit;
import com.gurwl.test.jpa.repository.RecruitRepository;

@RestController
public class JpaTest02Controller {
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	@GetMapping("/lesson07/quiz02/1")
	public Recruit getRecruitById() {
		Recruit recruit = recruitRepository.findById(8);
		
		return recruit;
	}
	
	@GetMapping("/lesson07/quiz02/2")
	public List<Recruit> getRecruitByCompanyId(@RequestParam("company_id") int companyId) {
		List<Recruit> recruitList = recruitRepository.findByCompanyId(companyId);
		
		return recruitList;
	}
	
	@GetMapping("/lesson07/quiz02/3")
	public List<Recruit> getRecruitByPositionAndType() {
		List<Recruit> recruitList = recruitRepository.findByPositionAndType(
				"웹 back-end 개발자",
				"정규직"
				);
		
		return recruitList;
	}
	
	@GetMapping("/lesson07/quiz02/4")
	public List<Recruit> getRecruitByTypeAndSalary() {
		List<Recruit> recruitList = recruitRepository.findByTypeOrSalaryGreaterThanEqual(
				"정규직",
				9000
				);
		
		return recruitList;
	}
	
	
	@GetMapping("/lesson07/quiz02/5")
	
	public List<Recruit> getRecruitByType() {
		List<Recruit> recruitList = recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
		
		return recruitList;
	}
	
	@GetMapping("/lesson07/quiz02/6")
	public List<Recruit> getRecruitBySalaryBetween() {
		List<Recruit> recruitList = recruitRepository.findByRegionAndSalaryBetween(
				"성남시 분당구", 7000, 8500);
		
		return recruitList;
	}
	
	
	@GetMapping("/lesson07/quiz02/7")
	public List<Recruit> getRecruitByNativeQuery() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date deadline = dateFormat.parse("2026-04-10");
		
		List<Recruit> recruitList = recruitRepository.findRecruitByDeadLineAndSalary(deadline, 8100,"정규직");
		
		return recruitList;
	}
}
