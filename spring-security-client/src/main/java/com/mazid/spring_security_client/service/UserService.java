package com.mazid.spring_security_client.service;


import com.mazid.spring_security_client.entity.User;
import com.mazid.spring_security_client.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
