package com.bookproject.bookservice.controller;

import com.bookproject.bookservice.model.Book;
import com.bookproject.bookservice.service.BookService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "bookworm/api/v1/book")
public class BookController {
    private final BookService bookService;

    @GetMapping("/genre")
    public List<Book> getBookByGenre(@RequestParam("genre") String genre){
        return bookService.getBookByGenre(genre);
    }

    @GetMapping("/author")
    public List<Book> getBookByAuthor(@RequestParam("author") String author){
        return bookService.getBookByAuthor(author);
    }

    @GetMapping("/top-rated")
    public List<Book> getTopRatedBooks(){
        return bookService.getTopRatedBooks();
    }
}
