package com.wrdeveloper.wrapi.repositores;

import com.wrdeveloper.wrapi.entities.Category;
import com.wrdeveloper.wrapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
