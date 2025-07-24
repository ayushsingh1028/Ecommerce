package com.ayush.Ecomm.repo;

import com.ayush.Ecomm.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
