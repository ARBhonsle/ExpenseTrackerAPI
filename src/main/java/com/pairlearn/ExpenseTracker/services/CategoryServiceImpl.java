package com.pairlearn.ExpenseTracker.services;

import java.util.List;

import com.pairlearn.ExpenseTracker.domain.Category;
import com.pairlearn.ExpenseTracker.exceptions.EtAuthException;
import com.pairlearn.ExpenseTracker.exceptions.EtBadRequestExeption;
import com.pairlearn.ExpenseTracker.exceptions.EtResourceNotFoundException;
import com.pairlearn.ExpenseTracker.repositories.CategoryRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRespository categoryRespository;

    @Override
    public List<Category> fetchAllCategories(Integer userId) {
        return categoryRespository.findAll(userId);
    }

    @Override
    public Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        return categoryRespository.findById(userId, categoryId);
    }

    @Override
    public Category addCategory(Integer userId, String title, String description) throws EtAuthException {
        int categoryId = categoryRespository.create(userId, title, description);
        return categoryRespository.findById(userId, categoryId);
    }

    @Override
    public void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestExeption {
        categoryRespository.update(userId, categoryId, category);        
    }

    @Override
    public void removeCategoryWithAllTransactions(Integer userId, Integer categoryId)
            throws EtResourceNotFoundException {
        this.fetchCategoryById(userId, categoryId);
        categoryRespository.removeById(userId, categoryId);
    }
    
}
