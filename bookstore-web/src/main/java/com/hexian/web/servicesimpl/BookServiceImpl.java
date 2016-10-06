package com.hexian.web.servicesimpl;

import com.hexian.web.servicesdao.BookServices;
import com.hzit.entity.Book;
import com.hzit.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public class BookServiceImpl implements BookServices {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> findall() {
        List<Book>list=bookMapper.searchBookByParams(null);
        return list;
    }
}
