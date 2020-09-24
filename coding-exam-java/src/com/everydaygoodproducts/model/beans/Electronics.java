package com.everydaygoodproducts.model.beans;

public class Electronics extends Item {
	
	private int warranty;


	public Electronics(int itemCode, int quantity, String itemName, double unitPrice, int warranty) {
		super(itemCode, quantity, itemName, unitPrice);
		this.warranty = warranty;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + "]";
	}

	
	

}
