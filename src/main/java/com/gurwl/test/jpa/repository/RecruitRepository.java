package com.gurwl.test.jpa.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gurwl.test.jpa.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer>{
	
	public Recruit findById(int id);
	
	public List<Recruit> findByCompanyId(@Param("companyId") int companyId);
	
	public List<Recruit> findByPositionAndType(String position, String type);
	
	public List<Recruit> findByTypeOrSalaryGreaterThanEqual(String type, int salary);
	
	public List<Recruit> findTop3ByTypeOrderBySalaryDesc(String type);
	
	public List<Recruit> findByRegionAndSalaryBetween(String region, int num1, int num2);
	
	@Query(value="select * from `recruit` where deadline >= :deadline and salary >= :salary and type = :type ORDER BY salary DESC", nativeQuery=true)
	public List<Recruit> findRecruitByDeadLineAndSalary(
			@Param("deadline") Date deadline, 
			@Param("salary") int salary, 
			@Param("type") String type);
}
