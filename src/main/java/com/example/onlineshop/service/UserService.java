package com.example.onlineshop.service;

import com.example.onlineshop.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User login(User user);//登录

    List<User> getUserList(Map<String, Object> userMap);

    int getCount(Map<String, Object> userMap);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

    User getUser(Integer id);
}
