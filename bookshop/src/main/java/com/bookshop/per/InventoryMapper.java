package com.bookshop.per;

import java.util.List;

import com.bookshop.domain.Inventory;

public interface InventoryMapper {
	public int getTotalCount();
	public Inventory getInventory(int product_id);
	public List<Inventory> getInventoryList();
	public void insInventory(Inventory inventory);
	public void upInventory(Inventory inventory);
	public void delInventory(int ino);
	
}
