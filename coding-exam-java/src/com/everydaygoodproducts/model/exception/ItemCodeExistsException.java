package com.everydaygoodproducts.model.exception;

public class ItemCodeExistsException extends Exception {
	
	private static final long serialverionUID = 1L;

	public ItemCodeExistsException() {
		super("Sorry item with the code already exists");
		
	}

	public ItemCodeExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	

}
