package com.cxb.ssm.controller;

import com.cxb.ssm.service.BookService;
import com.cxb.ssm.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/getAllBook")
    public String getAllBook(Model mod){
        List<Book> books = bookService.getAllBook();
        mod.addAttribute("books",books);
        return "book";
    }
}
