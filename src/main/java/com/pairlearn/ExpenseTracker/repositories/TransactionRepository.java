package com.pairlearn.ExpenseTracker.repositories;

import java.util.List;

import com.pairlearn.ExpenseTracker.domain.Transaction;
import com.pairlearn.ExpenseTracker.exceptions.EtBadRequestExeption;
import com.pairlearn.ExpenseTracker.exceptions.EtResourceNotFoundException;

public interface TransactionRepository {
    List<Transaction> findAll(Integer userId, Integer categoryId);
    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestExeption;
    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestExeption;
    void removeById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

}
