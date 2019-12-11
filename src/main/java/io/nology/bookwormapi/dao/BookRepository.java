package io.nology.bookwormapi.dao;

import io.nology.bookwormapi.entity.Book;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class BookRepository implements BookDAO {
    private EntityManager entityManager;

    @Autowired
    public BookRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Book> getAllBooks() {
        return entityManager
                .unwrap(Session.class)
                .createQuery("from Book", Book.class)
                .list();
    }

    @Override
    public Book getBookById(String id) {
        return entityManager
                .unwrap(Session.class)
                .createQuery("from Book where google_id=" + id, Book.class)
                .getSingleResult();
    }

    @Override
    public Book addBook(Book book) {
         entityManager.unwrap(Session.class).save(book);
         return book;
    }

    @Override
    public Book deleteBook(Book book) {
        entityManager.unwrap(Session.class).remove(book);
        return book;
    }
}
