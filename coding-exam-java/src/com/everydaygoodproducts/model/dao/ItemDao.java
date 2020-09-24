//this interface is present in the model - dao layer

package com.everydaygoodproducts.model.dao;

import com.everydaygoodproducts.model.beans.Item;

public interface ItemDao {
	
	public Item store(Item item);
	public Item[] fetchItems();
	public Item fetchItemByCode(int itemCode);

	


}
