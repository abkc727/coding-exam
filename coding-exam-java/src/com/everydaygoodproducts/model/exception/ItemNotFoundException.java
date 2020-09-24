//<Aditya Babu K C>
//this class defines the ItemNotFoundException thrown when the program cannot find the Item object.

package com.everydaygoodproducts.model.exception;

public class ItemNotFoundException extends Exception {
	
	private static final long serialverionUID = 1L;

	public ItemNotFoundException() {
		super("Sorry, Item not found!");
		
	}

	public ItemNotFoundException(String message) {
		super(message);
		
	}
	
	

}
