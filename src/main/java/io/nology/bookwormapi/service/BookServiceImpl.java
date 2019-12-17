package io.nology.bookwormapi.service;

import io.nology.bookwormapi.dao.BookDAO;
import io.nology.bookwormapi.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDAO theBookDao;

    @Autowired
    public BookServiceImpl(BookDAO theBookDao) {
        this.theBookDao = theBookDao;
    }

    @Override
    @Transactional
    public List<Book> getBooks() {
        return theBookDao.getAllBooks();
    }

    @Override
    @Transactional
    public Book getBookById(String searchId) {
        return theBookDao.getBookById(searchId);
    }

    @Override
    @Transactional
    public Book addBook(Book book) { return theBookDao.addBook(book); }

    @Override
    @Transactional
    public Book deleteBook(String googleId) {
        Book targetBook = this.getBookById(googleId);
        return theBookDao.deleteBook(targetBook);
    }
}
