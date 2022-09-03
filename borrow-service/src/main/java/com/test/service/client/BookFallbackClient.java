package com.test.service.client;

import com.test.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookFallbackClient implements BookClient{
    @Override
    public Book findBookById(int bid) {
        return new Book();
    }
}
