package com.shiro.controller;


import com.shiro.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;

import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, Model model){
        //获得subject主体
        Subject subject = SecurityUtils.getSubject();
        //创建令牌
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword());
        try {
            //登录
            subject.login(token);
            //登录成功保存session
            Session session= subject.getSession();
            //保存当前登录用户
            session.setAttribute("currentUser",user);
            //返回逻辑视图名
            return "session";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("errorInfo","用户名密码错误");
            return "login";
        }

    }
}
