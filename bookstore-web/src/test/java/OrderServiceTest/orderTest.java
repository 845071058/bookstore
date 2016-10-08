package OrderServiceTest;

import com.hexian.web.QiDong;
import com.hexian.web.services.OrderServices;
import com.hzit.vo.BookVo;
import com.hzit.vo.OrderlistVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(QiDong.class)
public class orderTest {
    @Autowired
    private OrderServices orderServices;

    @Test
    public void testone(){
        OrderlistVo orderlistVo=new OrderlistVo();
        orderlistVo.setUserid(1);
        BookVo bookVo1=new BookVo();
        bookVo1.setBookid(1);
        bookVo1.setCount(2);
        bookVo1.setBookprice(50);


        BookVo bookVo2=new BookVo();
        bookVo2.setBookid(2);
        bookVo2.setCount(4);
        bookVo2.setBookprice(45);
        List list=new ArrayList();
        list.add(bookVo1);
        list.add(bookVo2);
        orderlistVo.setBookVoList(list);

        int num=orderServices.insertorder(orderlistVo);
        System.out.println(num);
    }

}
