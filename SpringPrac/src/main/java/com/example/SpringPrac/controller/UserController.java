package com.example.SpringPrac.controller;

import com.example.SpringPrac.domain.User;
import com.example.SpringPrac.domain.UserRepository;
import com.example.SpringPrac.domain.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/api/user")
    public User createUser(@RequestBody UserRequestDto requestDto){
        User newUser = new User(requestDto);
        return userRepository.save(newUser);
    }

    @GetMapping("/api/user")
    public List<User> readUser(){
        return userRepository.findAll();
    }
}
