package com.hexian.web.controller;

import com.hexian.web.services.BookServices;
import com.hzit.entity.Book;
import com.hzit.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class ShopCartController {
    @Autowired
    private BookServices bookServices;

    @RequestMapping("/putcart")
    public String putcart(@RequestParam("bookid")String[]bookid,HttpSession session){

        Map cart=(Map)session.getAttribute("cart");
        if(cart==null){
             cart=new HashMap();
        }
      for(int i=0;i<bookid.length;i++){
         String currentbookid=bookid[i];
          Book book=bookServices.findbyid(currentbookid);
          BookVo bookVo=new BookVo();
          bookVo.setBookid(book.getBookid());
          bookVo.setBookcount(book.getBookcount());
          bookVo.setBookname(book.getBookname());
          bookVo.setBookprice(book.getBookprice());
          bookVo.setPicture(book.getPicture());
         /* bookVo.setCount(1);
          p.put(bookVo.getBookid(),bookVo);*/
          BookVo bookcartvo=(BookVo)cart.get(bookVo.getBookid());
          if(bookcartvo==null){
              bookVo.setCount(1);
          }
          else {
              bookVo.setCount(bookcartvo.getCount()+1);
          }
          cart.put(bookVo.getBookid(),bookVo);
          session.setAttribute("cart",cart);

      }
        return "redirect:/toshoping";
    }

    @RequestMapping("toshoping")
    public String toshoping(){
        return "shoping";
    }

    @RequestMapping("deletebyid")
    public String deletebyid(Integer bookvoid,HttpSession session){
        Map cart=(Map)session.getAttribute("cart");
        cart.remove(bookvoid);
        return "redirect:/toshoping";
    }

    @RequestMapping("updatecount")
    public Object updatecount(@RequestParam("bookvoid")Integer bookvoid,@RequestParam("count")Integer count,HttpSession session){
        Map cart=(Map)session.getAttribute("cart");
        BookVo bookVo=(BookVo)cart.get(bookvoid);
        bookVo.setCount(count);
        session.setAttribute("cart",cart);
        return "";
    }


}
