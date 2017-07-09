//package com.demo.dao;
//
//import java.util.List;
//import javax.annotation.Resource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.support.SqlSessionDaoSupport;
//import org.springframework.stereotype.Repository;
//
//import com.demo.entity.User;
//@Repository("userDao")
//public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
//
//    @Resource
//    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
//        this.setSqlSessionFactory(sessionFactory);
//    }
//    public User login(User user) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    public List<?> queryUsers() {
//        List<User> users = this.getSqlSession().selectList("queryUsers");
//        return users;
//    }
//
//    public Boolean insertUser(User user) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    public Boolean deleteUser(User user) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    public Boolean updateUser(User user) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//}
