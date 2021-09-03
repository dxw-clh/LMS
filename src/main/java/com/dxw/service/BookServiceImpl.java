package com.dxw.service;

import com.dxw.mapper.BookMapper;
import com.dxw.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    @Autowired
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> getBookList() {
        return bookMapper.getBookList();
    }

    @Override
    public List<Books> queryBookLikeName(String name) {
        return bookMapper.queryBookLikeName(name);
    }
}
