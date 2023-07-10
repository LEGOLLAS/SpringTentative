package com.gurwl.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurwl.test.mybatis.domain.RealEstate;
import com.gurwl.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;
	
	//전달된 id와 일치하는 매물 정보 얻기
	public RealEstate getRealEstate(int id) {
		RealEstate realEstate =  realEstateRepository.selectRealEstate(id);
		
		return realEstate;
	}
	
	
	//월세 매물 찾기
	public List<RealEstate> getRealEstateByPrice(int price) {		
		List<RealEstate> realEsateList =  realEstateRepository.selectRealEstateByPrice(price);

		return realEsateList;
	}
	
	
	public List<RealEstate> getRealEstateByAreaPrice(int area, int price) {
		List<RealEstate> realEsateAreaPriceList = realEstateRepository.selectRealEstateByAreaPrice(area, price);
		
		return realEsateAreaPriceList;
	}
	
	
	public int insertRealEstate(RealEstate realEstate) {
		return realEstateRepository.insertRealEstate(realEstate);
	}
	
	
	public int insertRealEstateByObject(String address, int area, String type, int price, int rentPrice) {
		return realEstateRepository.insertRealEstateByObject(address, area, type, price, rentPrice);
	}
}
