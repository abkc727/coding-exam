//This class implements the ItemDao interface

package com.everydaygoodproducts.model.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.everydaygoodproducts.model.beans.Item;

public class ItemDaoImplementation implements ItemDao {
	
	List<Item> itemList = new ArrayList<Item>();

	@Override
	public Item store(Item item) {
		
		itemList.add(item);
		return item;
	}

	@Override
	public Item[] fetchItems() {
		Item[] items = (Item[]) itemList.toArray(new Item[itemList.size()]);
		return items;
	}

	@Override
	public Item fetchItemByCode(int itemCode) {
		Item item = null;
		Iterator<Item> it = itemList.iterator();
		
		while(it.hasNext()) {
			Item u = it.next();
			if(u.getItemCode()==itemCode) {
				item = u;
				break;
			}
		}
		return item;
	}

}
