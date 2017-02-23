package com.odigoAI.service;

import com.odigoAI.domain.Book;

public interface BookService {
    public Book getBook(long id);

    public long addBook(Book book);

    public long getBookCount();
}
