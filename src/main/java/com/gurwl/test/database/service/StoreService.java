package com.gurwl.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gurwl.test.database.domain.Store;
import com.gurwl.test.database.repository.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	StoreRepository storeRepository;
	
	public List<Store> getStoreList() {
		List<Store> storeList = storeRepository.selectStoreList();
		return storeList;
	}
}
