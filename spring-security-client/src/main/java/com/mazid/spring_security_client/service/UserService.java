package com.mazid.spring_security_client.service;

import com.mazid.spring_security_client.entity.User;
import com.mazid.spring_security_client.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User register(User user) {
        user.setPassword(bCryptPasswordEncoder
                .encode(user.getPassword()));
        return userRepository.save(user);
    }
}
