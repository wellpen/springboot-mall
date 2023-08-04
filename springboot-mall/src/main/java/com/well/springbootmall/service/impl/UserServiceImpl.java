package com.well.springbootmall.service.impl;

import com.well.springbootmall.dao.UserDao;
import com.well.springbootmall.dto.UserRegisterRequest;
import com.well.springbootmall.model.User;
import com.well.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
