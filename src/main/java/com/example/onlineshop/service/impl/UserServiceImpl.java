package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.UserMapper;
import com.example.onlineshop.pojo.User;
import com.example.onlineshop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.selectByUser(user);
    }
    @Override
    public List<User> getUserList(Map<String, Object> userMap) {
        return userMapper.getUserList(userMap);
    }

    @Override
    public int getCount(Map<String, Object> userMap) {
        return userMapper.getCount(userMap);
    }

    @Override
    public int addUser(User user) { return userMapper.addUser(user);}

    @Override
    public int updateUser(User user) { return userMapper.updateUser(user);}

    @Override
    public int deleteUser(Integer id) { return userMapper.deleteUser(id);}

    @Override
    public User getUser(Integer id) { return userMapper.getUser(id);}

}



