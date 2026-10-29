package com.example.spring_boot_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping ("/api/welcome")
public class welcomeController {


    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to Spring Boot Application!");
    }
    
}
