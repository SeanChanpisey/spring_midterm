package com.rupp.spring_midterm.repository;

import com.rupp.spring_midterm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
