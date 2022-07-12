package com.eletricitycontroller.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class UserExpenses {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private BigDecimal rentBill;
    private BigDecimal electricityBill;
    private BigDecimal totalBill;
    private double kwUsed;
    private double kwMonthlyUsed;

    @ManyToOne
    private User user;

    public UserExpenses(User user, double kwUsed) {
        this.kwUsed = kwUsed;
    }

    public UserExpenses() {

    }

    public BigDecimal getRentBill() {
        return rentBill;
    }

    public BigDecimal getTotalBill() {
        return totalBill;
    }

    public double getKwUsed() {
        return kwUsed;
    }

    public void setKwUsed(double kwUsed) {
        this.kwUsed = kwUsed;
    }

    public double getKwMonthlyUsed() {
        return kwMonthlyUsed;
    }

    public void setKwMonthlyUsed(double kwMonthlyUsed) {
        this.kwMonthlyUsed = kwMonthlyUsed;
    }

    public void setRentBill(BigDecimal rent) {
        this.rentBill = rent;
    }

    public void setTotalBill(BigDecimal bill) {
        this.totalBill = bill;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(BigDecimal electricityBill) {
        this.electricityBill = electricityBill;
    }
}
