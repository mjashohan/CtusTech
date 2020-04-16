package com.ctustech.api.consume;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<TempProduct, Long>{
	public List<TempProduct> findAll();
}
