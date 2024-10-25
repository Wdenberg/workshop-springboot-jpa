package com.wrdeveloper.wrapi.config;

import com.wrdeveloper.wrapi.entities.User;
import com.wrdeveloper.wrapi.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User us = new User(null, "Wdenberg", "wdenberg@gmail.com", "123456", "99999999");
        User us1 = new User(null, "Berg Ramos", "berg@gmail.com", "123456", "8888888");

        userRepository.saveAll(Arrays.asList(us, us1));
    }
}
