package com.financeapp.models;

import java.time.LocalDate;

public class Income extends Transaction {

    public Income(String title, double amount, LocalDate date, Category category) {
        super(title, amount, date, category);
    }

    @Override
    public String getType() {
        return "Income";
    }
}
