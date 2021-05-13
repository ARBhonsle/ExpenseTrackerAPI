package com.pairlearn.ExpenseTracker.domain;

public class Transaction {
    private int transactionId;
    private int categoryId;
    private int userId;
    private double amount;
    private String note;
    private Long transactionDate;

    public Transaction(Integer transactionId, Integer categoryId, Integer userId, Double amount, String note, Long transactionDate){
        
        this.transactionId= transactionId;
        this.categoryId=categoryId;
        this.userId=userId;
        this.amount=amount;
        this.note=note;      
        this.transactionDate =transactionDate;  
    }
    public int getTransactionId() {
        return transactionId;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public int getUserId() {
        return userId;
    }
    public double getAmount() {
        return amount;
    }
    public String getNote() {
        return note;
    }
    public Long getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public void setTransactionDate(Long transactionDate) {
        this.transactionDate = transactionDate;
    }

}
