package com.findra.orderplacement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findra.orderplacement.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	Inventory findByProductId(Long productId);

}
