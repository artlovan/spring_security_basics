package org.spring_security.services;

import org.spring_security.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;


@Service
public class BookService {

    private Map<Integer, Book> map;

    public BookService() {
    }

    public BookService(Map<Integer, Book> map) {
        this.map = map;
    }

    public Collection<Book> getAll() {
        return map.values();
    }

    public Book findById(int id) {
        return map.get(id);
    }
}
