package com.eletricitycontroller.service.implementation.bill;

import com.eletricitycontroller.model.UserExpense;
import com.eletricitycontroller.service.BillCalcService;

public class BillCalcImplementation implements BillCalcService {
    public void calcTotalBill(UserExpense userExpenses) {
        if ((userExpenses.getRentBill() != null)) {
            userExpenses.setTotalBill(userExpenses.getRentBill().add(userExpenses.getElectricityBill()));
        } else {
            userExpenses.setTotalBill((userExpenses.getElectricityBill()));
        }
    }
}
