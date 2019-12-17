package io.nology.bookwormapi.dao;

import io.nology.bookwormapi.entity.Book;

import java.util.List;

public interface BookDAO {
    public List<Book> getAllBooks();
    public Book getBookById(String id);
    public Book addBook(Book book);
    public Book deleteBook(Book book);
}
