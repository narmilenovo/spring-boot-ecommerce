package com.example.springBootEcommerce.repository;

import com.example.springBootEcommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Page<Product> findByCategoryId(@RequestParam("id")Long id, Pageable pageable);
    Page<Product> findByNameContainingIgnoreCase(@RequestParam("name")String name, Pageable pageable);
}
