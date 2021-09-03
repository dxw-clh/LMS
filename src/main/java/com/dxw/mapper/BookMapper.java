package com.dxw.mapper;

import com.dxw.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Repository这里本来是要配置在实现类上的，但是spring帮我们做了，所以配置在接口上
public interface BookMapper {

    //添加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookID") int id);

    //跟新一本书
    int updateBook(Books books);

    //根据id查询一本书
    Books queryBookById(@Param("bookID") int id);

    //查询全部书
    List<Books> getBookList();

    //通过书名模糊查询
    List<Books> queryBookLikeName(@Param("bookName") String name);
}
