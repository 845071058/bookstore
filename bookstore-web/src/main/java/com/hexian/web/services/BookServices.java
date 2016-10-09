package com.hexian.web.services;

import com.fc.platform.commons.page.Page;
import com.hzit.entity.Book;

import java.util.List;

/**
* Created by Administrator on 2016/10/6.
        */
public interface BookServices {

    public List<Book> findall();

    public Page<Book>findbypage(int page,int rowcount);

    public Book findbyid(String bookid);

    public List<Book>findbyname(String bookname);
}
