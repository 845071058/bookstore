package com.hexian.web.services.servicesimpl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hexian.web.services.OrderServices;
import com.hzit.entity.Orderlist;
import com.hzit.entity.Xiangqing;
import com.hzit.mapper.OrderlistMapper;
import com.hzit.mapper.XiangqingMapper;
import com.hzit.vo.BookVo;
import com.hzit.vo.OrderlistVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by Administrator on 2016/10/8.
 */
@Service
public class OrderServiceImpl implements OrderServices {

    @Autowired
    private OrderlistMapper orderlistMapper;
    @Autowired
    private XiangqingMapper xiangqingMapper;

    @Override
    @Transactional  //添加事物支持。如果出现异常该方法的所有操作回滚
    public int insertorder(OrderlistVo orderlistVo) {
        String orderid=UUID.randomUUID().toString();
        //增加订单表的数据
        Orderlist orderlist=new Orderlist();
        orderlist.setOrderid(orderid);
        orderlist.setUserid(orderlistVo.getUserid());
        orderlist.setCreattime(new Date());
        orderlist.setState("已下单");
        int num=0;    //计算总价
        List<BookVo> list=orderlistVo.getBookVoList();
        for (BookVo b:list){
            num+=b.getCount()*b.getBookprice();
        }
        System.out.println(num);
        orderlist.setOrderprice(num);
        orderlistMapper.insertOrderlist(orderlist);
        //增加详情表数据
        for (BookVo b:list){
            Xiangqing xiangqing=new Xiangqing();
            xiangqing.setOrderid(orderid);
            xiangqing.setBookid(b.getBookid());
            xiangqing.setCount(b.getCount());
            xiangqing.setPrice(b.getBookprice());
            xiangqingMapper.insertXiangqing(xiangqing);
        }
             return 1;
    }

    @Override
    public List<OrderlistVo> findall(Integer userid) {
        List<OrderlistVo> list=orderlistMapper.findall(userid);
        return list;
    }

    @Override
    public Page<OrderlistVo> findallAndPage(Integer userid, int page, int rowcount) {
        PageRequest pg=new PageRequest(page,rowcount);
        return  orderlistMapper.findall(userid,pg);

    }
}
