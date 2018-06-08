package com.sajor.course.member.service.impl;

import com.sajor.course.member.dao.UserMapper;
import com.sajor.course.member.model.User;
import com.sajor.course.member.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(String id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public int getUsersCount() {
        return userMapper.findAllUsers().size();
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deteleUser(String id) {
        userMapper.deleteUser(id);
    }
}
