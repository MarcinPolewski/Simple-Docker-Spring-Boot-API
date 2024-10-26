package com.marcinjacekpolewski.spring_shop_api.rest;

import com.marcinjacekpolewski.spring_shop_api.Book;
import com.marcinjacekpolewski.spring_shop_api.dao.BookDAO;
import com.marcinjacekpolewski.spring_shop_api.dao.BookDAOJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SuperRestController {

    private BookDAO bookDAO;

    @Autowired
    SuperRestController(BookDAO bookDAO)
    {
        this.bookDAO = bookDAO;
    }


    @GetMapping("/hello")
    public String hello()
    {
        return "hello user number 1";
    }

    @GetMapping("/books")
    public List<Book> books()
    {
        return bookDAO.findAll();
    }

    @GetMapping("/books/{book_id}")
    public Book bookById(@PathVariable int book_id)
    {
        return bookDAO.find(book_id);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book)
    {
        System.out.println("dudududu");
        bookDAO.addEntry(new Book("book3"));
    }


}
