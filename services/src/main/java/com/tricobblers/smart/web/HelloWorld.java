package com.tricobblers.smart.web;

import com.tricobblers.smart.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorld {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/home")
    public String home() {
        return "Hello World!";
    }

}
