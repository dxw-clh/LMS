package com.dxw.service;

import com.dxw.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//接口一般是不需要配置bean的，我们一般也用不了
//只注入了实现类serviceImpl的bean，接口只是用来接收的。
public interface BookService {

    //添加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //跟新一本书
    int updateBook(Books books);

    //根据id查询一本书
    Books queryBookById(int id);

    //查询全部书
    List<Books> getBookList();

    //通过书名模糊查询
    List<Books> queryBookLikeName(String name);
}
