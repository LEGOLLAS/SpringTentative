package com.gurwl.test.database.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.gurwl.test.database.domain.Store;

@Repository
public interface StoreRepository {
	public List<Store> selectStoreList();
}
