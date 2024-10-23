package com.marcinjacekpolewski.spring_shop_api.dao;

import com.marcinjacekpolewski.spring_shop_api.Book;

import java.util.List;

public interface BookDAO {
    void addEntry(Book entry);
    List<Book> findAll();
    Book find(int id);
}
