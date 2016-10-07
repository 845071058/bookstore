package com.hexian.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/10/6.
 */
@SpringBootApplication
@ComponentScan({"com.fc","com.hexian.web.controller", "com.hexian.web.servicesdao","com.hexian.web.servicesimpl"})
@MapperScan("com.hzit.mapper")
public class QiDong {
    public static void main(String[] args) {
        SpringApplication.run(QiDong.class, args);
        System.out.println("spring启动");
    }
}
