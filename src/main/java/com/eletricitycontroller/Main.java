package com.eletricitycontroller;


import com.eletricitycontroller.model.User;
import com.eletricitycontroller.model.UserExpenses;
import com.eletricitycontroller.service.bill.BillCalc;
import com.eletricitycontroller.service.electricity.ElectricityCalc;
import com.eletricitycontroller.service.rent.RentCalc;
import com.eletricitycontroller.service.usage.UsedCalc;

public class Main {
    public static void main(String[] args) {
        User p = new User("paulo", "123123", "321321");
        UserExpenses userExpensesPaulo = new UserExpenses(p, 12.2);

        RentCalc rentCalc = new RentCalc();
        UsedCalc usedCalc = new UsedCalc();
        BillCalc billCalc = new BillCalc();

        usedCalc.calcUsedKw(userExpensesPaulo);
        usedCalc.calcMonthlyKw(userExpensesPaulo);
        ElectricityCalc electricityCalc = new ElectricityCalc();

        rentCalc.rentCalc(userExpensesPaulo);
        electricityCalc.calcElectricityBill(userExpensesPaulo);
        billCalc.calcTotalBill(userExpensesPaulo);

        System.out.println("Kwh Used: " + userExpensesPaulo.getKwUsed());
        System.out.println("Kw Used Month: " + userExpensesPaulo.getKwMonthlyUsed());

        System.out.println("Rent: " + userExpensesPaulo.getRentBill());
        System.out.println("Electricity Bill: " + userExpensesPaulo.getElectricityBill());
        System.out.println("Bill: " + userExpensesPaulo.getTotalBill());
    }
}