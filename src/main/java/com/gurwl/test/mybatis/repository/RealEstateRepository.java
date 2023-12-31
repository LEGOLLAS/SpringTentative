package com.gurwl.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gurwl.test.mybatis.domain.RealEstate;

@Repository
public interface RealEstateRepository {
	//전달된 id와 일치하는 매물 행 정보 조회
	public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateByPrice(@Param("rent") int price);
	
	public List<RealEstate> selectRealEstateByAreaPrice(
			@Param("area") int area, 
			@Param("price") int price
			);
	
	public int insertRealEstate(RealEstate realestate);
	
	public int insertRealEstateByObject(
			@Param("address") String address,
			@Param("area") int area,
			@Param("type") String type,
			@Param("price") int price,
			@Param("rentPrice") int rentPrice
			);
	
	public int updateRealEstate(
			@Param("id") int id,
			@Param("type") String type,
			@Param("price") int price
			);
	
	public int deleteRealEstate(@Param("id") int id);
}
