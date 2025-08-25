package com.example.BookStore;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Example custom query:
    // List<Book> findByTitleContaining(String title);
}
