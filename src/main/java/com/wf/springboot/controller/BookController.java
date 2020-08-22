package com.wf.springboot.controller;

import com.wf.springboot.domain.Book;
import com.wf.springboot.domain.CommonResult;
import com.wf.springboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author wf
 * @create 2020-08-22 17:10
 * @desc
 **/
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/{id}")
    public CommonResult<Book> getById(@PathVariable Integer id) {

        Optional<Book> byId = bookRepository.findById(id);
        Book book;
        if (byId.isPresent()) {
            book = byId.get();
        } else {
            book = null;
        }
        return new CommonResult(200, "success", book);
    }
}
