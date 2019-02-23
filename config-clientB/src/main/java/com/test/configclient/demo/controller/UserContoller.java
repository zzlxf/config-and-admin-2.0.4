package com.test.configclient.demo.controller;

import com.test.configclient.demo.entity.User;
import com.test.configclient.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserContoller {

    @Autowired
    private UserRepository userRepository;

    @PutMapping("/add")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/list")
    public List<User> list(){
        return userRepository.findAll();
    }
}
