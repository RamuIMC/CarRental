package com.sample.carrental.dto;


public class PerDayRent {
	
	private String price;
	private String discount;
	
	
	public PerDayRent() {
	}
	
	public PerDayRent(String price, String discount) {
		this.price = price;
		this.discount = discount;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	

	
}
