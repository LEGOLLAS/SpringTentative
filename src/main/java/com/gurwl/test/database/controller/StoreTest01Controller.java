package com.gurwl.test.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gurwl.test.database.domain.Store;
import com.gurwl.test.database.service.StoreService;

@Controller
public class StoreTest01Controller {
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping("/db/store/list")
	@ResponseBody
	public List<Store> getStoreList(){
		List<Store> storeList = storeService.getStoreList();
		return storeList;
	}
}
