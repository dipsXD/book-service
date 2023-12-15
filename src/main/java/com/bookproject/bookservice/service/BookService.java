package com.bookproject.bookservice.service;

import com.bookproject.bookservice.model.Book;
import com.bookproject.bookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;


    public List<Book> getBookByGenre(String genre) {
        return bookRepository.findAllByCategoriesContaining(genre);
    }

    public List<Book> getBookByAuthor(String author) {
        return bookRepository.findAllByAuthorsContaining(author);
    }

    public List<Book> getTopRatedBooks() {
        return bookRepository.findTop10ByOrderByRatingDesc();
    }
}
