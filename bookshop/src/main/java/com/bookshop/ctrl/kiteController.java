package com.bookshop.ctrl;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookshop.domain.Inventory;

public class kiteController {

	@RequestMapping("listInventory.do")
	public String getInventoryList(Model model) {
		model.addAttribute("list", inventoryService.getInventoryList());
		return "admin/inventory/list";
	}
	
	@RequestMapping("detailInventory.do")
	public String getInventory(@RequestParam("pno") int pno, Model model) {
		model.addAttribute("inventory", inventoryService.getInventory(pno));
		return "admin/inventory/get";
	}

	@GetMapping("insertInventory.do")
	public String insInventory(Model model) {
		return "admin/inventory/insert";
	}
	
	@PostMapping("insertInventoryPro.do")
	public String insInventoryPro(Inventory inventory, Model model) {
		inventoryService.insInventory(inventory);
		return "redirect:listInventory.do";
	}
	
	@GetMapping("updateInventory.do")
	public String upInventory(@RequestParam("ino") int ino, Model model) {
		model.addAttribute("inventory", inventoryService.getInventory(ino));
		return "admin/inventory/edit";
	}
	
	@PostMapping("updateInventoryPro.do")
	public String upInventoryPro(@RequestAttribute("inventory") Inventory inventory, Model model) {
		inventoryService.upInventory(inventory);
		return "redirect:listInventory.do";
	}
	
	@RequestMapping("delInventory.do")
	public String delInventory(@RequestParam("ino") int ino, Model model) {
		inventoryService.delInventory(ino);
		return "redirect:listInventory.do";
	}
}
