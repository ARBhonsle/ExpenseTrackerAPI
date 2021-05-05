package com.pairlearn.ExpenseTracker.services;

import com.pairlearn.ExpenseTracker.domain.User;
import com.pairlearn.ExpenseTracker.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
