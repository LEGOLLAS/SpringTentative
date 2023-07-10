package com.gurwl.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gurwl.test.mybatis.domain.RealEstate;
import com.gurwl.test.mybatis.service.RealEstateService;

@Controller
@RequestMapping("/mybatis/realestate")
public class RealEstateController {
	

	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/select/test01")
	@ResponseBody
	//id를 전달 받고, 해당 정보를 json 으로 response에 담는다.
	public RealEstate realEstate(@RequestParam("id") int id) {
		RealEstate realEstate =  realEstateService.getRealEstate(id);
		
		return realEstate;
	}
	
	
	@RequestMapping("/select/test02")
	@ResponseBody
	//월세를 전달받고, 해당 월세보다 낮은 월세 매물 json으로 response에 담는다. 
	public List<RealEstate> realEstateByPrice(@RequestParam("rent") int price) {
		List<RealEstate> realEstateList  =  realEstateService.getRealEstateByPrice(price);
		
		return realEstateList;
	}
	
	
	@RequestMapping("/select/test03")
	@ResponseBody
	//면적과 가격을 전달받고, 면적이 더 넓으면서 싼 매물을 json response로 전달
	public List<RealEstate> realEstateByAreaPrice(
				@RequestParam("area") int area, 
				@RequestParam("price") int price
			) {
		
		List<RealEstate> realEstateAreaPriceList = realEstateService.getRealEstateByAreaPrice(area, price);
		return realEstateAreaPriceList;
	}
	
	
	@RequestMapping("/insert/test01")
	@ResponseBody
	public String insertRealEstate(){
		RealEstate realEstate = new RealEstate();
		
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		
		int count =  realEstateService.insertRealEstate(realEstate);
		return "삽입 갯수 : " + count;
	}
	
	
	@RequestMapping("/insert/test02")
	@ResponseBody
	public String insertRealEstateByObject() {
		int count = realEstateService.insertRealEstateByObject(
				"썅떼빌리버 오피스텔 814호",
				45,
				"월세",
				100000,
				120);
		
		return "삽입 갯수 : " + count;
	}
	
}
