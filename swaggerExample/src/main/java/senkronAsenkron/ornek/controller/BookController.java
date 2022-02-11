package senkronAsenkron.ornek.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import senkronAsenkron.ornek.services.BookService;

@Api(value = "BookController", description = "Kitap Kontrol İşlemleri")
@RequestMapping("/api/books")
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String add( String book) {
       bookService.add(book);
        return  book+" başarıyla eklendi"+Thread.currentThread().getName();
    }
    @PostMapping("/add2")
    public String add2( String book) {
        bookService.add2(book);
        return  book+" başarıyla eklendi"+Thread.currentThread().getName();
    }


}
