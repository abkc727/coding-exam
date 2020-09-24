//this is the parent class item, the child classes inherits from this item

package com.everydaygoodproducts.model.beans;

public class Item {
	
	private int itemCode, quantity;
	private String itemName;
	private double unitPrice;
	
	
	



	public Item(int itemCode, int quantity, String itemName, double unitPrice) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
	}




	public int getItemCode() {
		return itemCode;
	}




	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public String getItemName() {
		return itemName;
	}




	public void setItemName(String itemName) {
		this.itemName = itemName;
	}




	public double getUnitPrice() {
		return unitPrice;
	}




	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}




	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", quantity=" + quantity + ", itemName=" + itemName + ", unitPrice="
				+ unitPrice + "]";
	}
	
	
	
	

}
