//<Aditya Babu K C>
//This is the main class that contains the main method
package com.everydaygoodproducts.controller;

import java.util.Scanner;

import com.everydaygoodproducts.model.beans.Apparel;
import com.everydaygoodproducts.model.beans.Electronics;
import com.everydaygoodproducts.model.beans.FoodItems;
import com.everydaygoodproducts.model.beans.Item;
import com.everydaygoodproducts.model.service.ItemService;
import com.everydaygoodproducts.model.utility.ItemFactory;
import com.everydaygoodproducts.model.utility.Type;
import java.time.LocalDate;


public class MainController {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int option = 0;
		String c = "y";
		
		FoodItems f1 = new FoodItems(10, 1, "Milk", 35.0D, "2020-10-25", "2021-11-25");
		FoodItems f2 = new FoodItems(102, 2, "Curd", 21.0D, "2019-01-11", "2022-10-03");
		
		Apparel a1 = new Apparel(104, 2, "T-Shirt", 1000.0D, "Medium", "cotton");
		Apparel a2 = new Apparel(105, 3, "Shirt", 2000.0D, "Large","Linen");
		
		Electronics e1 = new Electronics(107, 2, "TV", 10000.D, 12);
		Electronics e2 = new Electronics(108, 5, "Mobile", 12000.500D, 10);
		
		
		
		
		ItemService service = (ItemService)ItemFactory.getInstance(Type.SERVICE);
		
		do {
			System.out.println("----------------");
			System.out.println("1. Food Item  2. Apparel  3. Electronics  4. Exit");
			option=scanner.nextInt();
			
			
			
			
			switch(option) {
			
			case 1: 
				FoodItems f3 = service.createItem(f1);
				FoodItems f4 = service.createItem(f2);
				
				FoodItems f = service.getItems();
				for(Item i: items) {
					if(i!=null)
						System.out.println(i);
				}
				
				break;
				
			case 2:
				Apparel a3 = service.createItem(a1);
				Apparel a4 = service.createItem(a2);
				
				for(Item i: items) {
					if(i!=null)
						System.out.println(i);
				}
				
				
				break;
				
			case 3:
				
				Electronics e3 = service.createItem(e1);
				Electronics e4 = service.createItem(e2);
				
				for(Item i: items) {
					if(i!=null)
						System.out.println(i);
				}
				
				
				break;
				
			case 4:
				System.exit(0);
				
				
				
			} 
			System.out.println("Do you want to continue ? (Y/N)");
			c = scanner.next();
		}while(c=="Y" || c=="y");
		
		scanner.close();
		
	}

}
