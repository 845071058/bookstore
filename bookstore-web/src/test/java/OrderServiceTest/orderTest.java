package OrderServiceTest;

import com.fc.platform.commons.page.Page;
import com.hexian.web.QiDong;
import com.hexian.web.services.OrderServices;
import com.hzit.entity.Orderlist;
import com.hzit.vo.BookVo;
import com.hzit.vo.OrderlistVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void testtwo(){
        List<OrderlistVo> list=orderServices.findall(12);
       for (OrderlistVo l:list){
           System.out.println(l.getCreattime());
           System.out.println(l.getBookVoList());
           System.out.println(l.getOrderid());
           System.out.println(l.getOrderprice());
           System.out.println(l.getState());
           System.out.println(l.getUserid());
       }

    }
    @Test
    public void testthree(){

        Page<OrderlistVo> page=orderServices.findallAndPage(12,0,3);
        for (OrderlistVo orderlist:page){
            System.out.println(orderlist.getOrderid());
        }
         System.out.println("总页数："+page.getTotalPages()+"总行数："+page.getTotalElements());
    }
}
