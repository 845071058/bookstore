package UserTest;

import com.hexian.web.QiDong;
import com.hexian.web.services.servicesimpl.UserServiceImpl;
import com.hzit.entity.User;
import com.hzit.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(QiDong.class)
public class UserTest {
    @Autowired
   private UserMapper userMapper;
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void one(){
       List<User> list =userMapper.searchUserByParams(null);
        System.out.println(list);
    }

    @Test
    public void two(){
      List<User> list=userService.findByusername();
        System.out.println(list);
    }
    @Test
    public void three(){
        User user=userService.findone("任浩", "456");
        System.out.println(user.getUsername()+user.getPassword());
    }

    @Test
    public void four(){
        User user=new User();
        user.setUsername("wo");
        user.setPassword("12345");
        user.setEmail("www.555@qq.com");
        int num=userService.insert(user);
        System.out.println(num);
    }
}
