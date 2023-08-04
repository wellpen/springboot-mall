package com.well.springbootmall.service;

import com.well.springbootmall.dto.UserRegisterRequest;
import com.well.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

}
