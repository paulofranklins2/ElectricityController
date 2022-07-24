package com.eletricitycontroller.service;

import com.eletricitycontroller.model.UserExpense;

public interface BillCalcService {
    void calcTotalBill(UserExpense userExpenses);
}
