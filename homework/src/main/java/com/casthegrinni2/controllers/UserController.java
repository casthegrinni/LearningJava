package com.casthegrinni2.controllers;

import com.casthegrinni2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();
    @GetMapping("/")
    public User user(){
        User user = new User();
        user.setId(1L);
        user.setName("Billy");
        user.setUserName("staro");
        return user;
    }

    @PostMapping("/test")
    public User user(@RequestBody User user){
        users.add(user);
        return user;
    }

    @GetMapping("/list")
    public List<User> list() {
        return users;
    }
}
