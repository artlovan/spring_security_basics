package org.spring_security.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/tests")
public class TestController {
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<?, ?> testGet() {
        return new HashMap<String, String>(){
            {
                put("one", "tests one");
            }
        };
    }
}
