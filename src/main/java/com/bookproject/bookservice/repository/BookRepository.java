package com.bookproject.bookservice.repository;

import com.bookproject.bookservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findAllByCategoriesContaining(String category);

    List<Book> findAllByAuthorsContaining(String author);

    List<Book> findTop10ByOrderByRatingDesc();
}
