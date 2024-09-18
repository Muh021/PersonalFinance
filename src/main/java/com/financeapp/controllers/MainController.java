package com.financeapp.controllers;

import com.financeapp.models.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class MainController {
    private ObservableList<Transaction> transactions;

    public MainController() {
        transactions = FXCollections.observableArrayList();
    }

    public ObservableList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(String title, double amount, LocalDate date, Category category, String type) {
        Transaction transaction;
        if ("Income".equals(type)) {
            transaction = new Income(title, amount, date, category);
        } else {
            transaction = new Expense(title, amount, date, category);
        }
        transactions.add(transaction);
    }
}
