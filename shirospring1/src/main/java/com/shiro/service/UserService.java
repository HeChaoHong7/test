package com.shiro.service;

import com.shiro.entity.User;

public interface UserService {
    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     * @throws Exception
     */
    User findUserByName(String userName) throws Exception;
}
