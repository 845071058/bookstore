package com.hexian.web.controller;

import com.hexian.web.Interceptor.Checklogin;
import com.hexian.web.services.UserServices;
import com.hzit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2016/10/6.
 */
@RequestMapping("/controller")
@Controller
public class UserController extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //利用拦截器注册一个对象，给请求指定一个拦截的对象，并且指定拦截的路径。
        registry.addInterceptor(new Checklogin()).addPathPatterns("/controller/**");
        super.addInterceptors(registry);
    }

    @Autowired
    private UserServices userServices;

    @RequestMapping("/login")
    public String login(@RequestParam("username")String username,@RequestParam("password")String password,ModelMap modelmap){
        User user=userServices.findone(username,password);
        if (user==null){
            return "login";
        }else{
            return "index.html";
        }

    }
    @RequestMapping("/insert")
    public String insert(User user){
        int num=userServices.insert(user);
        if (num==1){
            return "register_success.html";
        }else {
            return "register.html";
        }

    }



}