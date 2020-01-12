package com.myretail.api.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.myretail.api.model.ProductDetails;
import com.myretail.api.model.ProductPrice;

@Repository
public class ProductDetailsRepositoryImpl {

	private static Map<Integer, ProductPrice> productDetaillsData = new HashMap<>();

	private static Map<Integer, String> productNameData = new HashMap<>();;
	
	private static AtomicInteger seq = new AtomicInteger();

	
	public ProductPrice findProductDetailsById(int id) {

		return productDetaillsData.get(id);
	}

	
	public String findProductNameById(int id) {

		return productNameData.get(id);
	}

	
	public ProductPrice createProductData(ProductDetails productDetails) throws Exception{
		
		try{
		int nextVal = seq.incrementAndGet();
		productDetails.setId(nextVal);
		productDetails.getProductPrice().setId(nextVal);
		productDetaillsData.put(nextVal, productDetails.getProductPrice());
		productNameData.put(nextVal, productDetails.getName());
		return productDetails.getProductPrice();
		}
		catch(Exception ex){
			throw new Exception("could not create resource");
		}
		
		
	}
	
   public ProductPrice updateProductData(int id ,ProductDetails productDetails) throws Exception{
		
		try{
		if(productDetaillsData.get(id)!=null)
		{
			productDetails.setId(id);
			productDetails.getProductPrice().setId(id);
			productDetaillsData.put(id, productDetails.getProductPrice());
			productNameData.put(id, productDetails.getName());
		}
		
		return productDetails.getProductPrice();
		}
		catch(Exception ex){
			throw new Exception("could not updated resource");
		}
		
		
	}
}
