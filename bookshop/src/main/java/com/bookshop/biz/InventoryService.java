package com.bookshop.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.domain.Inventory;
import com.bookshop.per.InventoryMapper;

@Service
public class InventoryService implements InventoryBiz{

	@Autowired
	private InventoryMapper inventoryDAO;

	@Override
	public int getTotalCount() {
		return inventoryDAO.getTotalCount();
	}
	
	@Override
	public List<Inventory> inventoryList() {
		return inventoryDAO.getInventoryList();
	}

	@Override
	public Inventory getInventory(int product_id) {
		return inventoryDAO.getInventory(product_id);
	}

	@Override
	public void insInventory(Inventory inventory) {
		inventoryDAO.insInventory(inventory);		
	}

	@Override
	public void upInventory(Inventory inventory) {
		inventoryDAO.upInventory(inventory);
	}

	@Override
	public void delInventory(int ino) {
		inventoryDAO.delInventory(ino);
	}

	
}