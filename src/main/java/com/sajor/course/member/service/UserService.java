package com.sajor.course.member.service;

import com.sajor.course.member.model.User;

import java.util.List;

public interface UserService {
    // 通过 id 查询
    public User findUserById(String id);
    // 添加
    public void addUser(User user);
    // 获取用户数量
    public int getUsersCount();
    // 获取所有用户
    public List<User> findAllUsers();
    // 修改用户
    public void updateUser(User user);
    // 删除用户
    public void deteleUser(String id);
}
