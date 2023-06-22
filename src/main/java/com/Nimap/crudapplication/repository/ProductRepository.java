package com.Nimap.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nimap.crudapplication.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}