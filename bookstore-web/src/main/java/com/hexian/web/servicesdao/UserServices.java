package com.hexian.web.servicesdao;

import com.hzit.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserServices {
    public List<User> findByusername();
    public User findone(String username,String password);
    public int insert(User user);
}
