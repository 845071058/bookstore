package com.hexian.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/10/6.
 */
@SpringBootApplication
@ComponentScan({"com.fc","com.hexian.web.controller", "com.hexian.web.services", "com.hexian.web.services.servicesimpl"})
@MapperScan("com.hzit.mapper")
public class QiDong extends SpringBootServletInitializer{

}
