package com.gurwl.test.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gurwl.test.jpa.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
