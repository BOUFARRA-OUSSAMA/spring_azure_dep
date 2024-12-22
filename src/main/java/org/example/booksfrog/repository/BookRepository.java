package org.example.booksfrog.repository;

import org.example.booksfrog.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByCategory_Id(Long categoryId);
    @Query(value = "SELECT * FROM book ORDER BY id DESC LIMIT 12", nativeQuery = true)
    List<Book> findLast12Books();

}
