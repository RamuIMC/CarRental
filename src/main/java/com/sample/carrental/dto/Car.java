package com.sample.carrental.dto;


public class Car {
	
	private String make;
	private String model;
	private String vin;
	private CarMetadata metadata;
	private PerDayRent perDayRent;
	private Metrics metrics;
	
	
	public Car() {
	}
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public CarMetadata getMetadata() {
		return metadata;
	}
	public void setMetadata(CarMetadata metadata) {
		this.metadata = metadata;
	}
	
	
	
	

}
