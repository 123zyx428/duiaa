package com.zhaike.service;

import com.zhaike.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<Users> login(String email, String password);
}
