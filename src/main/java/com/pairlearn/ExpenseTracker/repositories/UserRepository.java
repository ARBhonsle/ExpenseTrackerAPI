package com.pairlearn.ExpenseTracker.repositories;

import com.pairlearn.ExpenseTracker.domain.User;
import com.pairlearn.ExpenseTracker.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailandPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
