package com.soap.test.jozi.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soap.test.jozi.data.Insurance;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Integer> {
	
	List<Insurance> findByIdp(Integer idp);
	
}