package com.marcinjacekpolewski.spring_shop_api.dao;

import com.marcinjacekpolewski.spring_shop_api.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOJPA implements BookDAO {
    private EntityManager entityManager;

    @Autowired
    BookDAOJPA(EntityManager entityManager)
    {
        this.entityManager =entityManager;
    }

    @Override
    public void addEntry(Book entry) {
        entityManager.persist(entry);
    }


    @Override
    public List<Book> findAll() {
        TypedQuery<Book> query = entityManager.createQuery("FROM Book", Book.class);
        return query.getResultList();
    }

    @Override
    public Book find(int id)
    {
        return entityManager.find(Book.class, id);
    }

}
