package com.hexian.web.services.servicesimpl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hexian.web.services.BookServices;
import com.hzit.entity.Book;
import com.hzit.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public Book findbyid(String bookid) {
        Map p=new HashMap();
        p.put("bookid",bookid);
        List<Book>list=bookMapper.searchBookByParams(p);
       if (list.size()==1){
           return list.get(0);
       }
        else
        return null;
    }


}
