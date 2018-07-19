package com.findra.orderplacement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findra.orderplacement.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
