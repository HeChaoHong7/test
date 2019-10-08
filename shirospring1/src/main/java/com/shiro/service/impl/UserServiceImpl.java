package com.shiro.service.impl;

import com.shiro.dao.UserMapper;
import com.shiro.entity.User;
import com.shiro.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findUserByName(String userName) throws Exception {
        return userMapper.findUserByName(userName);
    }
}
