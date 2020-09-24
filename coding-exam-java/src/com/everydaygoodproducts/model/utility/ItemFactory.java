package com.everydaygoodproducts.model.utility;

import com.everydaygoodproducts.model.dao.ItemDaoImplementation;
import com.everydaygoodproducts.model.service.ItemServiceImplementation;

public class ItemFactory {
	
	
public static Object getInstance(Type type) {
		
		Object obj = null;
		
		switch(type) {
		case DAO:
			obj = new ItemDaoImplementation();
			break;
		case SERVICE: 
			obj = new ItemServiceImplementation();
			break;
		}
		return obj;
	}


}


