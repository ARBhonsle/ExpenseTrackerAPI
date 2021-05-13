package com.pairlearn.ExpenseTracker.repositories;

import java.util.List;

import com.pairlearn.ExpenseTracker.domain.Category;
import com.pairlearn.ExpenseTracker.exceptions.EtBadRequestExeption;
import com.pairlearn.ExpenseTracker.exceptions.EtResourceNotFoundException;

public interface CategoryRespository {
    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;
    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    Integer create(Integer userId, String title, String description) throws EtBadRequestExeption;
    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestExeption;
    void removeById(Integer userId, Integer categoryId); 
}
