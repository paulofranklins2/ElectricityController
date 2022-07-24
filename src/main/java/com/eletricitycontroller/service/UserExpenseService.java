package com.eletricitycontroller.service;

import com.eletricitycontroller.model.UserExpense;

public interface UserExpenseService {
    UserExpense newUserExpense(UserExpense userExpense);

    UserExpense getUserExpense(String id);

    UserExpense updateUserExpense(UserExpense userExpense);

    Boolean deleteUserExpense(String id);
}
