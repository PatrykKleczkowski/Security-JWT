package com.example.web.controller;

import com.example.domain.model.AuthToken;
import com.example.domain.model.LoginUser;
import com.example.domain.model.Role;
import com.example.domain.model.User;
import com.example.domain.repository.RoleRepository;
import com.example.domain.repository.UserRepository;
import com.example.security.JwtTokenUtil;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/api")
public class    UserController {

    @Autowired
    private UserService userService;

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
