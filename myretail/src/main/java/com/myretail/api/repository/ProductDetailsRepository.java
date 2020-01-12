package com.myretail.api.repository;


import org.springframework.stereotype.Repository;


import com.myretail.api.model.ProductPrice;

public interface ProductDetailsRepository {
	
	public ProductPrice findProductDetailsById(int id);
	
	public String findProductNameById(int id);
	
}
