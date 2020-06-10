package com.zhaike.service.Impl;

import com.zhaike.entity.Users;
import com.zhaike.entity.UsersExample;
import com.zhaike.mapping.UsersMapper;
import com.zhaike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public List<Users> login(String email, String password) {
        UsersExample usersExample=new UsersExample();
        usersExample.createCriteria().andEmailEqualTo(email);
        usersExample.createCriteria().andPasswordEqualTo(password);
        return  usersMapper.selectByExample(usersExample);
    }
}
