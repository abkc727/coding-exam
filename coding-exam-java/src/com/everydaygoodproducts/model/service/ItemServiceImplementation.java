//This class implements the ItemService Interface

package com.everydaygoodproducts.model.service;

import com.everydaygoodproducts.model.beans.Item;
import com.everydaygoodproducts.model.dao.ItemDao;
import com.everydaygoodproducts.model.exception.ItemNotFoundException;

public class ItemServiceImplementation implements ItemService {
	
	private ItemDao dao;

	@Override
	public Item createItem(Item item) {
		Item createdItem = dao.store(item);
		return item;
	}

	@Override
	public Item[] getItems() {
		
		return dao.fetchItems();
	}

	@Override
	public Item getItemByCode(int itemCode) {
		Item item = dao.fetchItemByCode(itemCode);
		if(item == null) {
			throw new ItemNotFoundException("Sorry item with code"+itemCode+"Not Found");
			
		}
		
		
		return item;
	}

}
