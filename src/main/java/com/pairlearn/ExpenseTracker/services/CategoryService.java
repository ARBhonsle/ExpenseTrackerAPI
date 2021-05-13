package com.pairlearn.ExpenseTracker.services;

import java.util.List;

import com.pairlearn.ExpenseTracker.domain.Category;
import com.pairlearn.ExpenseTracker.exceptions.EtAuthException;
import com.pairlearn.ExpenseTracker.exceptions.EtBadRequestExeption;
import com.pairlearn.ExpenseTracker.exceptions.EtResourceNotFoundException;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);
    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    Category addCategory(Integer userId, String title, String description) throws EtAuthException;
    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestExeption;
    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
