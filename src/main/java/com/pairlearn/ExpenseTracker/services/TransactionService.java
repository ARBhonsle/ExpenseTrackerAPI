package com.pairlearn.ExpenseTracker.services;

import java.util.List;

import com.pairlearn.ExpenseTracker.domain.Transaction;
import com.pairlearn.ExpenseTracker.exceptions.EtBadRequestExeption;
import com.pairlearn.ExpenseTracker.exceptions.EtResourceNotFoundException;


public interface TransactionService {
    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);
    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtResourceNotFoundException;
    Transaction updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestExeption;
    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
}
