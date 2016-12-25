package org.spring_security.services;

import org.spring_security.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookService extends JpaRepository<Book, Integer> {

}
