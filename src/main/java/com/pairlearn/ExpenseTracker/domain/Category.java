package com.pairlearn.ExpenseTracker.domain;

public class Category {
    private Integer categoryId;
    private Integer userId;
    private String title;
    private String description;
    private Double totalExpense;
    
    public Category(int categoryId, int userId, String title, String description, double totalExpense) {
        this.categoryId = categoryId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.totalExpense = totalExpense;
    }
    public Integer getCategoryId() {
        return categoryId;
    }
    public String getDescription() {
        return description;
    }
    public String getTitle() {
        return title;
    }public Double getTotalExpense() {
        return totalExpense;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }
    
}
