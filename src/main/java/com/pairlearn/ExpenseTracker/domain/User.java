package com.pairlearn.ExpenseTracker.domain;

public class User {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(Integer userId, String firstName, String lastName, String email, String password){
        this.userId=userId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
    }

    public Integer getUserId(){
        return userId;
    }

    public String getfirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }
    
    public String getemail(){
        return email;
    }

    public String getpassword(){
        return password;
    }

    public void setUserId(Integer userId){
        this.userId=userId;
    }

    public void setfirstName(String firstName){
        this.firstName=firstName;
    }

    public void setlastName(String lastName){
        this.lastName=lastName;
    }

    public void setemail(String email){
        this.email=email;
    }

    public void setpassword(String password){
        this.password=password;
    }

}
