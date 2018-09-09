package com.example.web.controller;

import com.example.domain.model.Role;
import com.example.domain.model.User;
import com.example.domain.repository.RoleRepository;
import com.example.domain.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/api")
public class    UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){

        return userService.save(user);
    }

    @GetMapping(value="/user")
    public List<User> listUser(){
        return userService.findAll();
    }

//    @GetMapping(value = "/user/{id}")
//    public User getOne(@PathVariable(value = "id") Long id){
//        return userService.findById(id);
//    }


}
