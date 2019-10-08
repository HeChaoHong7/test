package com.shiro.dao;

import com.shiro.entity.User;

public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     * @throws Exception
     */
    User findUserByName(String userName) throws Exception;

}
