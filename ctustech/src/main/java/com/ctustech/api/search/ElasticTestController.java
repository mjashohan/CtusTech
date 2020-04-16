package com.ctustech.api.search;

import java.util.List;

import com.ctustech.api.BlockImplementation.BlockChain;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.GetQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product/")
public class ElasticTestController {
	
	@Autowired
	private ElasticsearchOperations elasticsearchOperations;

	
	@Autowired
	private ElasticRepository elasticRepository;
	
	@GetMapping("/search")
	public String getSearchedItem(Model model,@RequestParam(name="q") String text) {
		QueryBuilder builders = QueryBuilders.boolQuery().should(QueryBuilders.queryStringQuery(text).lenient(true)
				.field("name")
				.field("type")
				.field("year")
				.field("week")
				.field("alertType")
				.field("alertNumber")
				.field("category")
				.field("product")
				.field("brand")
				.field("name")
				.field("numberOfModel")
				.field("batchNumberOrBarcode")
				.field("portalCategory")
				.field("countryOfOrigin")
				.field("riskType")
				.field("adoptedMeassure")
				.field("barCode")
				.field("batchNumber")
				.field("productionDates"))
				
				.should(QueryBuilders.queryStringQuery("*"+text+"*").lenient(true)
						.field("name")
						.field("type")
						.field("year")
						.field("week")
						.field("alertType")
						.field("alertNumber")
						.field("category")
						.field("product")
						.field("brand")
						.field("name")
						.field("numberOfModel")
						.field("batchNumberOrBarcode")
						.field("portalCategory")
						.field("countryOfOrigin")
						.field("riskType")
						.field("adoptedMeassure")
						.field("barCode")
						.field("batchNumber")
						.field("productionDates"));
		
		SearchQuery query = new NativeSearchQueryBuilder().withQuery(builders).build();
		List<Product> samples = elasticsearchOperations.queryForList(query, Product.class);
		model.addAttribute("products", samples);
		return "list";
	}
	
	@GetMapping("/list")
	public String getItemList(Model model) {
		List<Product> products = elasticRepository.findAll();
		model.addAttribute("products", products);
		return "";
	}
	
	@GetMapping("/item")
	public String getDetails(Model model,@RequestParam(name="i") String id) throws Exception {
		Product product = elasticsearchOperations.queryForObject(GetQuery.getById(id), Product.class);
		String hashValue = BlockChain.getHash(product.getYear(),product.getAlertNumber(),product.getName(),product.getRiskType());
		HashProduct hashProduct = new HashProduct(product, hashValue);
		model.addAttribute("product", hashProduct);
		return "details";
	}
}
