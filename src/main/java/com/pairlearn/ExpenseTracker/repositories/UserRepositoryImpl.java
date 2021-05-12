package com.pairlearn.ExpenseTracker.repositories;

import java.sql.PreparedStatement;
import java.sql.Statement;

import com.pairlearn.ExpenseTracker.domain.User;
import com.pairlearn.ExpenseTracker.exceptions.EtAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final String SQL_CREATE =
          "INSERT INTO ET_USERS(USER_ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD) VALUES(NEXTVAL('ET_USERS_SEQ',?,?,?,?)";
    private static final String SQL_COUNT_BY_EMAIL="SELECT COUNT(*) FROM ET_USERS WHERE EMAIL = ? ";
    private static final String SQL_FIND_BY_ID="SELECT USER_ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD FROM ET_USERS WHERE USER_ID = ?";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws EtAuthException {
        // TODO Auto-generated method stub
        try{
            KeyHolder keyHolder= new GeneratedKeyHolder();
            jdbcTemplate.update(connection -> {
                PreparedStatement ps=connection.prepareStatement(SQL_CREATE, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, email);
                ps.setString(4, password);
                return ps;
            },keyHolder);
                return (Integer) keyHolder.getKeys().get("USER_ID");
        } catch(Exception e){
            throw new EtAuthException("Invalid Details. Failed to create Account");
        }
    }

    @Override
    public User findByEmailandPassword(String email, String password) throws EtAuthException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        // TODO Auto-generated method stub
        return jdbcTemplate.queryForObject(SQL_COUNT_BY_EMAIL,  Integer.class, email);
    }

    @Override
    public User findById(Integer userId) {
        // TODO Auto-generated method stub
        //return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, userId, userRowMapper);
        return null;
    }
    
}
