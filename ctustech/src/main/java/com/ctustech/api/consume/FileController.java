package com.ctustech.api.consume;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctustech.api.search.Product;

@RestController
@RequestMapping("/file")
public class FileController {

	@Autowired
	private FileConsumer consumer;
	
	
	
	@GetMapping("/json")
	public void readJson() {
		List<TempProduct> products = consumer.consumeJsonFile();
		consumer.saveDataToDB(products);		
	}
	@GetMapping("/elastic")
	public List<Product> readElastic() {
		List<Product> products = consumer.mapProduct();
		if(products.size()>0)
			consumer.saveDataToElasticServer(products);
		return products;
	}
}
