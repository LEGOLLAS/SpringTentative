package com.gurwl.test.pension.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurwl.test.pension.domain.Booking;
import com.gurwl.test.pension.repository.PensionRepository;

@Service
public class PensionService {

	@Autowired
	private PensionRepository pensionRepository;
	
	public Booking searchBooking(String name, String phoneNumber) {
		Booking booking = pensionRepository.searchBooking(name, phoneNumber);
		return booking;
	}
}
