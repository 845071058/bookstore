package bookservicestest;

import com.fc.platform.commons.page.Page;
import com.hexian.web.QiDong;

import com.hexian.web.servicesimpl.BookServiceImpl;
import com.hzit.entity.Book;
import com.hzit.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(QiDong.class)
public class BookTest {
    @Autowired
    private BookServiceImpl bookService;
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void findall() {
        List<Book> list = bookService.findall();
        for (Book s : list) {
            System.out.println(s.getBookname());
        }
    }

    @Test
    public void findbypage() {
        Page<Book> p = bookService.findbypage(1, 3);
        List<Book>list=p.getContent();
        for(Book s:list){
            System.out.println(s.getBookname());
        }
    }
}