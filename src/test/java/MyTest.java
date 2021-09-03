import com.dxw.mapper.BookMapper;
import com.dxw.pojo.Books;
import com.dxw.pojo.User;
import com.dxw.service.BookService;
import com.dxw.service.BookServiceImpl;
import com.dxw.service.UserService;
import com.dxw.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void testMapper(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService userService= (BookService) context.getBean("bookServiceImpl");

        List<Books> book = userService.queryBookLikeName("J");

        for (Books books : book) {
            System.out.println(books);
        }
    }
}
