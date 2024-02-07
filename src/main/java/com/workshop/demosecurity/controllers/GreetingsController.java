package com.workshop.demosecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greetings")
public class GreetingsController {
    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("hello from our greetings Api");
    }
    @GetMapping("/saygoodbye")
    public ResponseEntity<String> goodbye(){
        return ResponseEntity.ok("goodbye and see you later");
    }
}
