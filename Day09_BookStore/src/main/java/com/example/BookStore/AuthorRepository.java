package com.example.BookStore;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    // You can add custom query methods if needed
    // Example: List<Author> findByNameContaining(String name);
}
