package com.hexian.web.controller;

import com.fc.platform.commons.page.Page;
import com.hexian.web.services.OrderServices;
import com.hzit.entity.Orderlist;
import com.hzit.entity.User;
import com.hzit.vo.BookVo;
import com.hzit.vo.OrderlistVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
public class OrderController extends  BaseController{
@Autowired
    private OrderServices orderServices;

    @RequestMapping("/doorder")
    public String insertorder(HttpSession session) {
        //session中获取user对象
        User user = (User) session.getAttribute("user");
        //session中获取购物车对象
        Map<Integer, BookVo> cart = (Map) session.getAttribute("cart");
        //获取购物车中的值
        Collection<BookVo> v = cart.values();
        //将购物车中的图书放入集合中,以便放于订单对象中
        List list = new ArrayList();
        for (BookVo bookVo : v) {
            list.add(bookVo);
        }
        OrderlistVo orderlistVo = new OrderlistVo();
        orderlistVo.setUserid(user.getUserid());
        orderlistVo.setBookVoList(list);
        int num = orderServices.insertorder(orderlistVo);
        return "success";
    }
    @RequestMapping("/toorder")
    public String toorder(HttpSession session,ModelMap modelMap){
        User user = (User) session.getAttribute("user");
        int userid=user.getUserid();
        List<OrderlistVo> list=orderServices.findall(userid);
        modelMap.put("list",list);
        return  "orderlist";
    }


     @RequestMapping("/dopage")
    public String dopage(@RequestParam( name="page",defaultValue = "0")int page,ModelMap modelMap,HttpSession session){
        session.setAttribute("cart", null);
         System.out.println( session.getAttribute("cart"));
         if(page<0){
            page=0;
        }
         User user=(User)session.getAttribute("user");
         Integer userid=user.getUserid();
        Page<OrderlistVo> pageone=orderServices.findallAndPage(userid,page,4);
         modelMap.put("pageone",pageone);
         modelMap.put("ordercurrent",page);

        return "orderlist";
    }
}
