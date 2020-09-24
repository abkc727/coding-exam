//this interface is present in the model - dao layer

package com.everydaygoodproducts.model.dao;

import com.everydaygoodproducts.model.beans.Item;

public interface ItemDao {
	
	public Item storeFood(Item item);
	public Item[] fetchItems();
	public Item fetchItemByCode(int itemCode);
	
	public Item storeApparel(Item item);
	public Item[] fetchItems();
	public Item fetchItemByCode(int itemCode)
	
	public Item storeElectronics(Item item);
	public Item[] fetchItems();
	public Item fetchItemByCode(int itemCode)

}
