package com.everydaygoodproducts.model.service;

import com.everydaygoodproducts.model.beans.Item;
import com.everydaygoodproducts.model.exception.ItemNotFoundException;

public interface ItemService {
	
	public Item createItem(Item item);
	public Item[] getItems();
	public Item getItemByCode(int itemCode) throws ItemNotFoundException;

}
