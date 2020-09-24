package com.everydaygoodproducts.model.beans;

import java.time.LocalDate;

public class FoodItems extends Item {
	
	LocalDate dateOfManufacture, dateOfExpiry;

	
	
	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}



	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}



	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}



	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}



	public FoodItems(int itemCode, int quantity, String itemName, double unitPrice, LocalDate dateOfManufacture, LocalDate dateOfExpiry) {
		super(itemCode, quantity, itemName, unitPrice);
		// TODO Auto-generated constructor stub
		this.dateOfExpiry = dateOfExpiry;
		this.dateOfManufacture = dateOfManufacture;
	}



	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + "]";
	}


	
	
	
	

}
