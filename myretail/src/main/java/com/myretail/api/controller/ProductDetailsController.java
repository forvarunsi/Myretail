package com.myretail.api.controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.myretail.api.model.ProductDetails;
import com.myretail.api.model.ProductPrice;
import com.myretail.api.service.ProductDetailsService;
@RestController
@RequestMapping("/product")
public class ProductDetailsController {

	private final Logger log = Logger.getLogger(ProductDetailsController.class.getName());
	
	@Autowired
	@Qualifier(value="productDetailService")
	ProductDetailsService productDetailsService;
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ProductDetails getProductDetails(@PathVariable int id) throws  IOException{
		log.info("in controller getProductDetails id :"+id);
		ProductDetails prodDetails=null;
		prodDetails=productDetailsService.getProductDetails(id);
		log.info(" return productDetails :"+prodDetails);
		return prodDetails;
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ProductPrice createProductDetails(@RequestBody ProductDetails prodDetails) throws Exception{
		log.info("in controller putProductDetails requestBody :"+prodDetails);
		 return productDetailsService.createProductDetails(prodDetails);
		
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public ProductPrice updateProductDetails(@PathVariable int id,@RequestBody ProductDetails prodDetails) throws Exception{
		log.info("in controller putProductDetails requestBody :"+prodDetails);
		return productDetailsService.updateProductDetails(id, prodDetails);

	}
}
