package com.eletricitycontroller.service;

import com.eletricitycontroller.model.UserExpense;

public interface UsedCalcService {
    void calcUsedKw(UserExpense userExpenses);
    void calcMonthlyKw(UserExpense userExpenses);
}
