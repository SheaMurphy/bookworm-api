package io.nology.bookwormapi.service;

import io.nology.bookwormapi.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBooks();
    public Book getBookById(String searchId);
    public Book addBook(Book book);
    public Book deleteBook(String googleId);
}
