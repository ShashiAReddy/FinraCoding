package com.findra.orderplacement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findra.orderplacement.entity.Order;
	
public interface OrderRepository extends JpaRepository<Order, Long> {

}
