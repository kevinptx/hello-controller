package com.example.hellocontroller.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(required=false, defaultValue="World") String name){
        return String.format("Hello %s from my first Spring Boot Application!", name);
    }

    @GetMapping("/{name}")
    public String sayHelloPath(@PathVariable(required = false) String name){
        return String.format("Hello %s, from sayHelloPath", name == null ? "World" : name);
    }

    @PostMapping
    public String sayHelloPost(@RequestBody String name){
        return String.format("Hello %s, from sayHelloPost", name);
    }
}


