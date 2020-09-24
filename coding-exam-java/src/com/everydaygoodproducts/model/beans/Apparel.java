package com.everydaygoodproducts.model.beans;

public class Apparel extends Item{
	
	private String size, material;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Apparel(int itemCode, int quantity, String itemName, double unitPrice, String size, String material) {
		super(itemCode, quantity, itemName, unitPrice);
		// TODO Auto-generated constructor stub
		this.material = material;
		this.size = size;
		
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", material=" + material + "]";
	}

	
	
	
	
	
	

}
