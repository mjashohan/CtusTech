package com.ctustech.api.consume;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ctustech.api.search.SubProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.ctustech.api.search.ElasticRepository;
import com.ctustech.api.search.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FileConsumer {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ElasticRepository elasticRepository;

	public List<TempProduct> consumeJsonFile() {
		List<TempProduct> products = null;
		try {
			File file = ResourceUtils.getFile("classpath:data_2020.json");
			ObjectMapper mapper = new ObjectMapper();
			products = mapper.readValue(file, new TypeReference<List<TempProduct>>() {
			});
      	} catch (IOException e) {
			e.printStackTrace();
		}
		return products;
	}



	public void saveDataToDB(List<TempProduct> products) {
		if (products != null) {
			productRepository.saveAll(products);
		}
	}

	public void saveDataToElasticServer(List<Product> products) {
		
		if (products != null) {
			elasticRepository.saveAll(products);
		}
	}

	public List<Product> mapProduct() {
		List<Product> products = new ArrayList<Product>();
		List<TempProduct> temp = productRepository.findAll();
		if (temp != null) {
			for (TempProduct tempProduct : temp) {
				Product product = new Product();
				product.setId(String.valueOf(tempProduct.getId()));
				product.setAdoptedMeassure(tempProduct.getAdoptedMeassure());
				product.setAlertNumber(tempProduct.getAlertNumber());
				product.setAlertType(tempProduct.getAlertType());
				product.setBarCode(tempProduct.getBarCode());
				product.setBatchNumber(tempProduct.getBatchNumber());
				product.setBatchNumberOrBarcode(tempProduct.getBatchNumberOrBarcode());
				product.setBrand(tempProduct.getBrand());
				product.setCategory(tempProduct.getCategory());
				product.setCompanyRecallCode(tempProduct.getCompanyRecallCode());
				product.setCompanyRecallPage(tempProduct.getCompanyRecallPage());
				product.setCounterfeit(tempProduct.getCounterfeit());
				product.setCountryOfOrigin(tempProduct.getCountryOfOrigin());
				product.setDescription(tempProduct.getDescription());
				product.setFoundAndTakenMeassure(tempProduct.getFoundAndTakenMeassure());
				product.setName(tempProduct.getName());
				product.setNumberOfModel(tempProduct.getNumberOfModel());
				product.setPackagingDescription(tempProduct.getPackagingDescription());
				product.setPortalCategory(tempProduct.getPortalCategory());
				product.setProduct(tempProduct.getProduct());
				product.setProductionDates(tempProduct.getProductionDates());
				product.setRisk(tempProduct.getRisk());
				product.setRiskType(tempProduct.getRiskType());
				product.setSubmittedBy(tempProduct.getSubmittedBy());
				product.setTechnicalDefect(tempProduct.getTechnicalDefect());
				product.setUrlOfCase(tempProduct.getUrlOfCase());
				product.setWeek(tempProduct.getWeek());
				product.setYear(tempProduct.getYear());

				products.add(product);

			}
		}
			return products;
		}

}
