package com.pairlearn.ExpenseTracker.services;

import java.util.regex.Pattern;

import com.pairlearn.ExpenseTracker.domain.User;
import com.pairlearn.ExpenseTracker.exceptions.EtAuthException;
import com.pairlearn.ExpenseTracker.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        // TODO Auto-generated method stub
        Pattern pattern = Pattern.compile("^(,*)@(.*)$");
        if(email != null)
            email=email.toLowerCase();        
        if(!pattern.matcher(email).matches())
         throw new EtAuthException("Invalid Email format");
        Integer count= userRepository.getCountByEmail(email);
        if(count>0)
         throw new EtAuthException("Email already in use");
         Integer userId=userRepository.create(firstName, lastName, email, password);
         return userRepository.findById(userId);
    }
    
}
