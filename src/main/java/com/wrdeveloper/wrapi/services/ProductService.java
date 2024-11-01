package com.wrdeveloper.wrapi.services;

import com.wrdeveloper.wrapi.entities.Product;
import com.wrdeveloper.wrapi.entities.User;
import com.wrdeveloper.wrapi.repositores.ProductRepository;
import com.wrdeveloper.wrapi.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public  Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
