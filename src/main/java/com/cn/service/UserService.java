package com.cn.service;

import com.cn.model.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    List<User> findAllUser(int pageNum, int pageSize);
}