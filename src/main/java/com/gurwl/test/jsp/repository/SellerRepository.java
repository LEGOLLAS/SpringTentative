package com.gurwl.test.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gurwl.test.jsp.domain.Seller;

@Repository
public interface SellerRepository {
	public int addSeller(
			@Param("name") String name, 
			@Param("imgUrl") String imgUrl,
			@Param("temperature")double temperature
			);
	
	
	public Seller selectSellerLast(@Param("id") int id);
	
	public Seller selectSeller();
}
