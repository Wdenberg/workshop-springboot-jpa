package com.wrdeveloper.wrapi.repositores;

import com.wrdeveloper.wrapi.entities.OrderItem;
import com.wrdeveloper.wrapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
