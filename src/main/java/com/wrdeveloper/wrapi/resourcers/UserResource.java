package com.wrdeveloper.wrapi.resourcers;

import com.wrdeveloper.wrapi.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value= "/user")
public class UserResource {


   @GetMapping
   public ResponseEntity<User> findAll(){
      User us = new User(1L, "Wdenberg", "wdenberg@gmail.com", "123456");
      return ResponseEntity.ok().body(us);
   }
}
