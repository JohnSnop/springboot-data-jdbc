package com.wf.springboot.repository;

import com.wf.springboot.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wf
 * @create 2020-08-22 17:03
 * @desc
 **/
public interface BookRepository extends JpaRepository<Book, Integer> {

}
