package io.nology.bookwormapi.controller;

import io.nology.bookwormapi.entity.Book;
import io.nology.bookwormapi.exceptions.ResourceNotFoundException;
import io.nology.bookwormapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    private BookService theBookService;

    @Autowired
    public BookController(BookService theBookService) {
        this.theBookService = theBookService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() throws ResourceNotFoundException {
        List<Book> books = theBookService.getBooks();
        if (books == null) {
            throw new ResourceNotFoundException("No books in favourites collection");
        };
        return ResponseEntity.status(HttpStatus.OK).body(books);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable String bookId) throws ResourceNotFoundException {
        Book book = theBookService.getBookById(bookId);
        if (book == null) {
            throw new ResourceNotFoundException("No books matching id: " + bookId + " found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(book);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(theBookService.addBook(book));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/books/{googleId}")
    public ResponseEntity<Book> addBook(@PathVariable String googleId) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(theBookService.deleteBook(googleId));
    }
}
