package com.Nimap.crudapplication.repository;


import com.Nimap.crudapplication.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;





public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}