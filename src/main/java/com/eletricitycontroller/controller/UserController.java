package com.eletricitycontroller.controller;

import com.eletricitycontroller.model.User;
import com.eletricitycontroller.repository.UserExpenseRepository;
import com.eletricitycontroller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserExpenseRepository userExpensesRepository;

    @PostMapping
    User newUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    List<User> findAll(){
        return userRepository.findAll();
    }

}
