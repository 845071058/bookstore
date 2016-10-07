package com.hexian.web.services;

import com.hzit.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserServices {

    public User findone(String username,String password);
    public int insert(User user);
    public int findByUsername(String username);
}
