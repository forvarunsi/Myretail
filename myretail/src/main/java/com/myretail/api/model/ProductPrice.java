package com.myretail.api.model;

import java.io.Serializable;


public class ProductPrice implements Serializable{

	
	private static final long serialVersionUID = -8331537878236316444L;
	private Integer id;
	private Long price;
	private String currencyCode;
	
	
	public ProductPrice(){
	}
	
	


	public ProductPrice(Integer id, Long price, String currencyCode) {
		super();
		this.id = id;
		this.price = price;
		this.currencyCode = currencyCode;
	}




	public Long getPrice() {
		return price;
	}


	public void setPrice(Long price) {
		this.price = price;
	}


	public String getCurrencyCode() {
		return currencyCode;
	}


	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}




	@Override
	public String toString() {
		return "ProductPrice [id=" + id + ", price=" + price + ", currencyCode=" + currencyCode + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductPrice other = (ProductPrice) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}




	
	
}
