package com.eletricitycontroller.service.rent;

import com.eletricitycontroller.model.UserExpenses;

import java.math.BigDecimal;

public class RentCalc {
    public void rentCalc(UserExpenses userExpenses) {
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
