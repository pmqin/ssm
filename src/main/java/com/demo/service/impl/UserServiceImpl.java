package com.demo.service.impl;  
  
import java.util.List;

import javax.annotation.Resource;  
  




import org.springframework.stereotype.Service;  
  




import com.demo.dao.UserDao;  
import com.demo.entity.User;  
import com.demo.service.UserService;  
  
@Service("userService")  
public class UserServiceImpl implements UserService{  
  
    @Resource  
    private UserDao userDao;  
      
    public User login(User user) {  
        return userDao.login(user);  
    }

	
	public Boolean insertUser(User user) {
		return userDao.insertUser(user);
	}

	public Boolean deleteUser(User user) {
		return userDao.deleteUser(user);
	}

	public Boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

    public List<?> query() {
        return userDao.queryUsers();
    }  
  
}