package com.bookshop.ctrl;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookshop.biz.InventoryService;
import com.bookshop.biz.ProductService;
import com.bookshop.domain.Inventory;
import com.mysql.cj.Session;

@Controller
@RequestMapping("/inventory/")
public class InventoryController {

	private static final Logger log = LoggerFactory.getLogger(InventoryController.class);
	
	@Autowired
	private InventoryService inventoryService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private HttpSession session;	
	
	
	//재고 업데이트(Product Table)
	@GetMapping("upstock.do")   
	public String upstock(Model model) {
		return "";
	}
	
	//입/출고 총합 조회
	@GetMapping("total.do")
    public String total(Model model) {
        return "inventory/total";
    }
	
	//입고 (사용자 구매 후 수량) //상품 아이디, 멤버를 가져와서 조건 걸기 + 반품 받은 것도 합치기 시도중
	@GetMapping("upInventory.do")
	 public String upInventory(@RequestParam int product_id, @RequestParam boolean Purchase, @RequestParam int take) {
        Inventory inventory = inventoryService.getInventory(product_id);
        if (inventory == null) {
            return "상품을 찾지 못했습니다.";
        }

        if (Purchase) {
            if (inventory.getAmount() < take) {
                return "구매 불가";
            }
            inventory.setAmount(inventory.getAmount() - take);
        } else {
            inventory.setAmount(inventory.getAmount() + take);
        }

        inventoryService.upInventory(inventory);
        return "admin/inventory/insert";
    }

	
	//출고 (사용자 반품 후 수량)
	@PostMapping("delInventory.do")
	public String delInventory(@RequestParam("ino") int ino,Model model) {
		inventoryService.delInventory(ino);
		session.invalidate();
		return "redirect:/admin/insert";
	}
	
	
}