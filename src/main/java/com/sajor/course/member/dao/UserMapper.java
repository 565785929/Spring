package com.sajor.course.member.dao;

import com.sajor.course.member.model.User;

import java.util.List;

public interface UserMapper {
    // 通过 id 查询
    public User findUserById(String id);
    // 添加
    public void addUser(User user);
    // 查询所有用户
    public List<User> findAllUsers();
    // 删除用户
    public void deleteUser(String id);
    // 修改用户
    public void updateUser(User user);
}
