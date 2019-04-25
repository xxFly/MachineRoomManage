package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.UserMapper;
import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl{
//public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserMapper userMapper;
//
//    @Override
//    public int addUser(User user) {
//        return userMapper.insert(user);
//    }
//
//    @Override
//    public int deleteUserById(Integer id) {
//        return userMapper.deleteByPrimaryKey(id);
//    }
//
//    @Override
//    public int updateUser(User user) {
//        return userMapper.updateByPrimaryKey(user);
//    }
//
//    @Override
//    public User selectByUser(User user) {
//        return userMapper.selectByUser(user);
//    }
//
//    @Override
//    public List<User> queryAllUser() {
//        return null;
//    }
//
//    @Override
//    public void mqTest() {
//        System.out.println("--------------------------");
//        System.out.println("进入消息队列测试");
//    }
}
