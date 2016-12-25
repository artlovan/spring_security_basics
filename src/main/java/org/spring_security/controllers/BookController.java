package org.spring_security.controllers;

import org.spring_security.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/books")
@PreAuthorize("hasRole('ROLE_ADMIN')")
//@Secured("ROLE_ADMIN")
public class BookController {

    @Autowired
    @Qualifier("bookFixture")
    private BookService bookRepository;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllBooks() {
        return new ResponseEntity<>(bookRepository.getAll(), HttpStatus.OK);
    }
}
