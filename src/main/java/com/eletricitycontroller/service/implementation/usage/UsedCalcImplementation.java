package com.eletricitycontroller.service.implementation.usage;


import com.eletricitycontroller.model.UserExpense;
import com.eletricitycontroller.service.UsedCalcService;

public class UsedCalcImplementation implements UsedCalcService {
    public void calcMonthlyKw(UserExpense userExpenses) {
        userExpenses.setKwMonthlyUsed(Math.round((userExpenses.getKwUsed() * 1.30) * 24) * 31);
    }

    public void calcUsedKw(UserExpense userExpenses) {
        userExpenses.setKwUsed(userExpenses.getKwUsed() * 1.30);
    }

}
