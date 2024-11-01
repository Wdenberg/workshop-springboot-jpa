package com.wrdeveloper.wrapi.services;

import com.wrdeveloper.wrapi.entities.Order;

import com.wrdeveloper.wrapi.repositores.OrderRepository;
import com.wrdeveloper.wrapi.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public  Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
