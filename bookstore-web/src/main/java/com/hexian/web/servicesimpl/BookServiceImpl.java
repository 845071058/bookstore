package com.hexian.web.servicesimpl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hexian.web.servicesdao.BookServices;
import com.hzit.entity.Book;
import com.hzit.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class BookServiceImpl implements BookServices {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> findall() {
        List<Book>list=bookMapper.searchBookByParams(null);
        return list;
    }

    public Page<Book>findbypage(int page,int rowcount){
        PageRequest pg=new PageRequest(page,rowcount);
        Page<Book>data=bookMapper.searchBookByParams(null,pg);
        return  data;
    }
}
