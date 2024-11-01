package com.wrdeveloper.wrapi.repositores;

import com.wrdeveloper.wrapi.entities.Product;
import com.wrdeveloper.wrapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
