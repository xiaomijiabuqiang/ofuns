package com.example.onlineshop.mapper;

import com.example.onlineshop.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    User selectByUser(User user);

    List<User> getUserList(Map<String, Object> userMap);

    int getCount(Map<String, Object> userMap);

    User getUser(Integer id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);
}