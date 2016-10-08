package com.hexian.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class BaseController extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //利用拦截器注册一个对象，给请求指定一个拦截的对象，并且指定拦截的路径。
   // registry.addInterceptor(new Checklogin()).addPathPatterns("/controller/**");
        super.addInterceptors(registry);
    }
}
