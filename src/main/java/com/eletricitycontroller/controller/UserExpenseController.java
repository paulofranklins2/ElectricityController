package com.eletricitycontroller.controller;

import com.eletricitycontroller.model.UserExpense;
import com.eletricitycontroller.repository.UserExpenseRepository;
import com.eletricitycontroller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expenses")
public class UserExpenseController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserExpenseRepository userExpensesRepository;

    @PostMapping
    UserExpense newUserExpenses(@RequestBody UserExpense userExpenses) {
        return userExpensesRepository.save(userExpenses);
    }
//
//    List<UserExpenses> findAll() {
//        return userExpensesRepository.findAll();
//    }
}
