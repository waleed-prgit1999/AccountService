package com.example.AccountService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("abc")
    public String Hello(){
        return "Hello";
    }

}
