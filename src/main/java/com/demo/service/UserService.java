package com.demo.service;  
  
import java.util.List;


import com.demo.entity.User;  
  
public interface UserService {  
    public User login(User user); 
    public List<?> query(); 
    public Boolean insertUser(User user);
    public Boolean deleteUser(User user);
    public Boolean updateUser(User user);
}  