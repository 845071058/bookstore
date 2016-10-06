package com.hexian.web.controller;

import com.fc.platform.commons.page.Page;
import com.hexian.web.servicesimpl.BookServiceImpl;
import com.hzit.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping("/page")
    public String findbypage(@RequestParam( name="page",defaultValue = "0")int page,ModelMap modelMap){
        System.out.println("已经进入了控制器");
        Page<Book>data=bookService.findbypage(page, 3);
        modelMap.put("slist",data);

        return "index1";
    }
}
