package org.example.booksfrog.service;

import org.example.booksfrog.dto.BookDTO;
import org.example.booksfrog.mapper.BookMapper;
import org.example.booksfrog.model.Book;
import org.example.booksfrog.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> getBooksByCategoryId(Long categoryId) {
        return bookRepository.findByCategory_Id(categoryId);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }


    public List<BookDTO> getLast12Books() {
        return bookRepository.findLast12Books()
                .stream()
                .map(BookMapper::toDTO) // Convert each Book to BookDTO
                .collect(Collectors.toList());
    }


    // Fetch book content by ID, returning it as byte[]
    public Optional<byte[]> getBookContentById(Long id) {
        return bookRepository.findById(id).map(Book::getContent);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
