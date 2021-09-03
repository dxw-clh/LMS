package com.dxw.controller;

import com.dxw.pojo.Books;
import com.dxw.service.BookService;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BooksController {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    //查询全部书籍
    @RequestMapping("/allBook")
    public String getAllBooks(Model model){

        List<Books> bookList = bookService.getBookList();

        model.addAttribute("list",bookList);

        return "books";
    }

    //跳转到添加书籍页面
    @RequestMapping("/toAddPage")
    public String toAddPage(){

        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books,Model model){

        int i = bookService.addBook(books);

        //这里直接使用redirect:/book/allBook，重定向到books页面，直接复用了getAllBooks方法
        //重定向到某个页面的时候，页面会自动发起请求，如果是使用默认的转发，那么还需要转发数据，不推荐使用
        return i==0?"error":"redirect:/book/allBook";

        //return "redirect:/book/allbook";

    }

    //跳转到修改书籍页面
    //使用RestFul风格接收数据
    @RequestMapping("/toUpdatePage/{id}")
    public String toUpdatePage(@PathVariable("id") String id,Model model){

        int i = Integer.parseInt(id);

        Books book = bookService.queryBookById(i);

        model.addAttribute("book",book);

        return "updateBook";
    }

    @RequestMapping("/queryBook/{id}")
    public String queryBook(@PathVariable String id,Model model){
        Books book = null;

        if (!StringUtils.isNullOrEmpty(id)){
            book = bookService.queryBookById(Integer.parseInt(id));
            model.addAttribute("book",book);
        }

        return book==null?"error":"bookInfo";
    }

    //更新书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books book){

        System.out.println(book);

        int i = bookService.updateBook(book);

        //如果i>0表示更新成功，重定向到书籍列表页面(重定向会自动请求数据，实现代码复用：复用了第一个方法)
        return i==0?"error":"redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable String id){

        int i = 0;

        if (!StringUtils.isNullOrEmpty(id)){
            i = bookService.deleteBookById(Integer.parseInt(id));
        }

        return i==0?"error":"redirect:/book/allBook";
    }

    @RequestMapping("/queryLikeName")
    public String queryLikeName(String qbName,Model model){

        List<Books> list = bookService.queryBookLikeName(qbName);

        System.out.println(list);

        model.addAttribute("list",list);
        model.addAttribute("qbName",qbName);

        return "books";
    }

}
