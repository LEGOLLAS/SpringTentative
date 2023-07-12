package com.gurwl.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurwl.test.jsp.domain.Seller;
import com.gurwl.test.jsp.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public int addSeller(String name, String img_url, double temperature) {
		return sellerRepository.addSeller(name, img_url, temperature);
	}
	
	public Seller getSellerLast(int id) {
		Seller seller = sellerRepository.selectSellerLast(id);
		
		return seller;
	}
	
	public Seller getSeller() {
		Seller seller = sellerRepository.selectSeller();
		
		return seller;
	}
}
