package com.galvanize.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    static String hello() {
        return "Hello from my test!";
    }

    @GetMapping("/cats")
    public String getCats() {
        return "All the cats!";
    }
}
