package com.demo.dao;  
  
import java.util.List;

import com.demo.entity.User;  
  
public interface UserDao {  
  
    public User login(User user);  
    public List<?> queryUsers(); 
    public Boolean insertUser(User user);
    public Boolean deleteUser(User user);
    public Boolean updateUser(User user);
    
}  