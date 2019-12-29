package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TiaoshiController {

    @GetMapping("/api/posts/categories/featured")
    public String test1(){
        System.out.println("请求‘/api/posts/categories/featured’成功");
        return "[{},{}]";
    }
}
