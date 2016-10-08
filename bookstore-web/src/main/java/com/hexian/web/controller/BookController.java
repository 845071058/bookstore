package com.hexian.web.controller;

import com.fc.platform.commons.page.Page;
import com.hexian.web.Interceptor.Checklogin;
import com.hexian.web.services.BookServices;
import com.hexian.web.services.servicesimpl.BookServiceImpl;
import com.hzit.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
/*@RequestMapping("controller")*/
public class BookController  {
    public BookController(){
        //System.out.println("进入了");
    }
    @Autowired
    private BookServices bookService;

    @RequestMapping("/bypage")
    public String findbypage(@RequestParam( name="page",defaultValue = "0")int page,ModelMap modelMap){
        //System.out.println("已经进入了控制器");
        if(page<0){
            page=0;
        }
        Page<Book>data=bookService.findbypage(page, 3);
        modelMap.put("slist",data);
        modelMap.put("current",page);
        return "index";
    }

   /* @RequestMapping("/findbyid")
    public String findbyid(String bookid,ModelMap modelMap){
        Book book=bookService.findbyid(bookid);
        modelMap.put("book",book);
        return "";
    }*/
    @RequestMapping("/findbyname")

    public String findbyname(@RequestParam("bookname")String bookname,ModelMap modelMap){
        List<Book>list=bookService.findbyname(bookname);
        modelMap.put("list",list);
        return "search";
    }


}
