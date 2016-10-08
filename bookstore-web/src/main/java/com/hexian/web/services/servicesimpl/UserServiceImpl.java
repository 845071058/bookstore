package com.hexian.web.services.servicesimpl;

import com.hexian.web.services.UserServices;
import com.hzit.entity.User;
import com.hzit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class UserServiceImpl implements UserServices{
    @Autowired
    private UserMapper userMapper;


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

    @Override
    public int findByUsername(String username) {
        Map map=new HashMap();
        map.put("username",username);
        List<User> list=userMapper.searchUserByParams(map);
        if (list==null){
            return 1;
        }else {
            return -1;
        }


    }


}
