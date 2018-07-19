package com.findra.orderplacement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findra.orderplacement.entity.Inventory;
import com.findra.orderplacement.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepository inventoryRepository;

	public boolean checkInventory(Long productId, int quantity) {
		Inventory inventory = inventoryRepository.findByProductId(productId);
		return inventory.getQuantity() >= quantity;
	}

}
