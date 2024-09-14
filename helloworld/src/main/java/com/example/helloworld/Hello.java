package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    private static final String port = "asdfr";

    @RequestMapping("/")
    public String greet() {
        return "Hello World";
    }

    @RequestMapping("/about")
    public String about() {
        return "Let's learn Spring";
    }

    @RequestMapping(value = "/" + port)
    public String home() {
        float v = 457f;
        float v1 = 457.0f;
        return String.valueOf(v1);
    }

}
