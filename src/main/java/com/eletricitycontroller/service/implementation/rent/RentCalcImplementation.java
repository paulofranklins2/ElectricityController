package com.eletricitycontroller.service.implementation.rent;

import com.eletricitycontroller.model.UserExpense;
import com.eletricitycontroller.service.RentCalcService;

import java.math.BigDecimal;

public class RentCalcImplementation implements RentCalcService {
    public void rentCalc(UserExpense userExpenses) {
        double used = userExpenses.getKwUsed();
        int rounded = (int) Math.round(used);
        int counter = 0;
        for (int i = 0; i < rounded; i++) {
            counter++;
        }
        int price = counter * 100;
        userExpenses.setRentBill(new BigDecimal(price));
    }
}
