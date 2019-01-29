package com.sample.carrental.dto;


public class CarMetadata {
	
	private String color;
	private String notes;
	
	
	public CarMetadata() {
	}
	
	public CarMetadata(String color, String notes) {
		this.color = color;
		this.notes = notes;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	

}
