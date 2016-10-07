package com.hexian.web.services.servicesimpl;

import com.hexian.web.services.UserServices;
import com.hzit.entity.User;
import com.hzit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class UserServiceImpl implements UserServices{
    @Autowired
    private UserMapper userMapper;

    @Override
    public  List<User> findByusername() {
       List<User> list=userMapper.searchUserByParams(null);
        return list;
    }

    @Override
    public User findone(String username,String password) {
        User user=userMapper.findByUsernamePassWord(username,password);
        return user;
    }

    @Override
    public int insert(User user) {
        int num=userMapper.insertUser(user);
        return num;
    }


}
