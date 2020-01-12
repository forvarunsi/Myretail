package com.myretail.api.service;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.myretail.api.model.ProductDetails;
import com.myretail.api.model.ProductPrice;
import com.myretail.api.repository.ProductDetailsRepositoryImpl;

@Service(value="productDetailService")
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ProductDetailsServiceImpl implements ProductDetailsService {
	private final Logger log = Logger.getLogger(ProductDetailsServiceImpl.class.getName());
	
	@Autowired
	private ProductDetailsRepositoryImpl productdetailsRepositoryImpl;
	
	
	@Override
	public ProductDetails getProductDetails(int id) throws IOException{
		log.info("in  getProductDetails ");
		log.debug("id: "+id);

		ProductPrice prodPrice=productdetailsRepositoryImpl.findProductDetailsById(id);
		String productName = getProductName(id);
		if(prodPrice==null || productName == null ){
			log.error("price detail null mongo exception thrown");
			throw new IOException("price details for product with id="+id+" not found in mongo db for collection productprice");
		}
		log.debug("prodDetails is created with product id : "+id);
		return new ProductDetails(id,productName,prodPrice);

	}


	
	private String getProductName(int id) throws IOException{
			
			 //Assume that this is for mocking of finding product name    
			return productdetailsRepositoryImpl.findProductNameById(id);
	
	
	}

	@Override
	public ProductPrice createProductDetails(ProductDetails newProduct) throws Exception {
		
		return productdetailsRepositoryImpl.createProductData(newProduct);
		
		
	}

	@Override
	public ProductPrice updateProductDetails(int id, ProductDetails newProduct) throws Exception {
		// TODO Auto-generated method stub
		return productdetailsRepositoryImpl.updateProductData(id,newProduct);
	}

}
