package com.eletricitycontroller.service.usage;


import com.eletricitycontroller.model.UserExpenses;

public class UsedCalc {
    public void calcMonthlyKw(UserExpenses userExpenses) {
        userExpenses.setKwMonthlyUsed(Math.round((userExpenses.getKwUsed() * 1.30) * 24) * 31);
    }

    public void calcUsedKw(UserExpenses userExpenses) {
        userExpenses.setKwUsed(userExpenses.getKwUsed() * 1.30);
    }

}
