package com.eletricitycontroller.service.bill;

import com.eletricitycontroller.model.UserExpenses;

public class BillCalc {
    public void calcTotalBill(UserExpenses userExpenses){
        userExpenses.setTotalBill(userExpenses.getRentBill().add(userExpenses.getElectricityBill()));
    }
}
