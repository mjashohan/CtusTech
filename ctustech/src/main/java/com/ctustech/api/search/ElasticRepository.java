package com.ctustech.api.search;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticRepository extends ElasticsearchRepository<Product,String> {
	public List<Product> findAll();
	public List<Product> findByName(String name);
}
