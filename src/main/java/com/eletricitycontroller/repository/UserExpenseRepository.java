package com.eletricitycontroller.repository;

import com.eletricitycontroller.model.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserExpenseRepository extends JpaRepository<UserExpense, String> {
}
