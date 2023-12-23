package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {


        // http://localhost:9002/contacts/user/1112
//        return this.userService.getuser(userId);

         User user = this.userService.getuser(userId);

            // this is using static url
        // List contacts = this.restTemplate.getForObject("http://localhost:9002/contacts/user/" + user.getUserId(), List.class);
        //this is using service name available in eureka server
         List contacts = this.restTemplate.getForObject("http://contact-service/contacts/user/" + user.getUserId(), List.class);

        user.setContacts(contacts);
        return user;

    }
}
