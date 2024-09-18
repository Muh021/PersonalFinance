package com.financeapp.models;

import java.time.LocalDate;

public class Expense extends Transaction {

    public Expense(String title, double amount, LocalDate date, Category category) {
        super(title, amount, date, category);
    }

    @Override
    public String getType() {
        return "Expense";
    }
}
