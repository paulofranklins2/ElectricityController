package com.eletricitycontroller.service.electricity;

import com.eletricitycontroller.model.UserExpenses;

import java.math.BigDecimal;

public class ElectricityCalc {
    public void calcElectricityBill(UserExpenses userExpenses) {
        BigDecimal billCalc = new BigDecimal(userExpenses.getKwMonthlyUsed()).multiply(new BigDecimal(0.13)).setScale(2, BigDecimal.ROUND_HALF_UP);
        userExpenses.setElectricityBill(billCalc);
    }
}
