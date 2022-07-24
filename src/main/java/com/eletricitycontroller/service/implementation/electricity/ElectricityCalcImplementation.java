package com.eletricitycontroller.service.implementation.electricity;

import com.eletricitycontroller.model.UserExpense;

import java.math.BigDecimal;

public class ElectricityCalcImplementation {
    public void calcElectricityBill(UserExpense userExpenses) {
        BigDecimal billCalc = new BigDecimal(userExpenses.getKwMonthlyUsed()).multiply(new BigDecimal(0.13)).setScale(2, BigDecimal.ROUND_HALF_UP);
        userExpenses.setElectricityBill(billCalc);
    }
}
