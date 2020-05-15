package com.cxb.ssm.service.impl;

import com.cxb.ssm.dao.BookMapper;
import com.cxb.ssm.service.BookService;
import com.cxb.ssm.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAllBook() {
        return bookMapper.getAllBook();
    }
}
