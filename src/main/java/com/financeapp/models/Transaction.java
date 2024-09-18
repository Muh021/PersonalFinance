package com.financeapp.models;

import java.time.LocalDate;

public abstract class Transaction {
    private String title;
    private double amount;
    private LocalDate date;
    private Category category;

    public Transaction(String title, double amount, LocalDate date, Category category) {
        this.title = title;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public abstract String getType();
}
