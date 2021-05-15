package com.pairlearn.ExpenseTracker.services;

import java.util.List;

import com.pairlearn.ExpenseTracker.domain.Transaction;
import com.pairlearn.ExpenseTracker.exceptions.EtBadRequestExeption;
import com.pairlearn.ExpenseTracker.exceptions.EtResourceNotFoundException;
import com.pairlearn.ExpenseTracker.repositories.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId) {
        return transactionRepository.findAll(userId, categoryId);
    }

    @Override
    public Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId)
            throws EtResourceNotFoundException {
                return transactionRepository.findById(userId,categoryId,transactionId);        
    }

    @Override
    public Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note,
            Long transactionDate) throws EtBadRequestExeption {
        int transactionId= transactionRepository.create(userId, categoryId, amount, note, transactionDate);
        return transactionRepository.findById(userId, categoryId, transactionId);
    }

    @Override
    public void updateTransaction(Integer userId, Integer categoryId, Integer transactionId,
            Transaction transaction) throws EtBadRequestExeption {
               
    }

    @Override
    public void removeTransaction(Integer userId, Integer categoryId, Integer transactionId)
            throws EtResourceNotFoundException {
                transactionRepository.removeById(userId, categoryId, transactionId);
        
    }

    
}
