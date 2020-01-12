package com.myretail.api.service;

import java.io.IOException;


import com.myretail.api.model.ProductDetails;
import com.myretail.api.model.ProductPrice;

public interface ProductDetailsService {

	public ProductDetails getProductDetails(int id) throws IOException;
	
	public ProductPrice createProductDetails(ProductDetails newProduct) throws Exception;
	
	public ProductPrice updateProductDetails(int id,ProductDetails newProduct) throws Exception;
}
