package com.wrdeveloper.wrapi.services;

import com.wrdeveloper.wrapi.entities.Category;
import com.wrdeveloper.wrapi.entities.User;
import com.wrdeveloper.wrapi.repositores.CategoryRepository;
import com.wrdeveloper.wrapi.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public  Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
