package com.wrdeveloper.wrapi.config;

import com.wrdeveloper.wrapi.entities.Category;
import com.wrdeveloper.wrapi.entities.Order;
import com.wrdeveloper.wrapi.entities.User;
import com.wrdeveloper.wrapi.entities.enus.OrderStatus;
import com.wrdeveloper.wrapi.repositores.CategoryRepository;
import com.wrdeveloper.wrapi.repositores.OrderRepository;
import com.wrdeveloper.wrapi.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2,cat3));


        User us = new User(null, "Wdenberg", "wdenberg@gmail.com", "123456", "99999999");
        User us1 = new User(null, "Berg Ramos", "berg@gmail.com", "123456", "8888888");


        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, us1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, us);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,us1);
        userRepository.saveAll(Arrays.asList(us, us1));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }


}
