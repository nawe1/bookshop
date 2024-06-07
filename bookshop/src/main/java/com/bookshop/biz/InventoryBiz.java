package com.bookshop.biz;

import java.util.List;

import com.bookshop.domain.Inventory;

public interface InventoryBiz {
	int getTotalCount();
	List<Inventory> inventoryList();
	Inventory getInventory(int product_id);
	void insInventory(Inventory inventory);
	void upInventory(Inventory inventory);
	void delInventory(int ino);
	
}
