package bookservicestest;

import com.hexian.web.QiDong;
import com.hexian.web.servicesdao.BookServices;
import com.hzit.entity.Book;
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
    private BookServices bookServices;
    @Test
    public void findall(){
        List<Book> list=bookServices.findall();
        for(Book s:list){
            System.out.println(s.getBookname());
        }
    }
}
