package com.gurwl.test.pension.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.gurwl.test.pension.domain.Booking;

@Repository
public interface PensionRepository {
	
	public Booking searchBooking(
		@Param("name") String name,
		@Param("phoneNumber") String phoneNumber
	);
}
