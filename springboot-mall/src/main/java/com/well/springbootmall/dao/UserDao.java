package com.well.springbootmall.dao;

import com.well.springbootmall.dto.UserRegisterRequest;
import com.well.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
