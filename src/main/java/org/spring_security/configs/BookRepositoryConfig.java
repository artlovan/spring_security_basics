package org.spring_security.configs;

import org.spring_security.models.Book;
import org.spring_security.services.BookService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BookRepositoryConfig {

    @Bean(name = "bookFixture")
    public BookService initBookFixtureData() {
        Map<Integer, Book> map = new HashMap<>();

        map.put(1, new Book(1, "See You At The Top", "Zip Ziglar", 765869));
        map.put(2, new Book(2, "The Day That Turns Your Life Around", "Jom Rohn", 765869));
        map.put(3, new Book(3, "No Excuses", "Brian Tracy", 564367));

        return new BookService(map);
    }
}
