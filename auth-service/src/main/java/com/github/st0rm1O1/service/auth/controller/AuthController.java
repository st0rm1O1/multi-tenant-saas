package com.github.st0rm1O1.service.auth.controller;

import com.github.st0rm1O1.service.auth.dto.AuthRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthRequest authRequest) {
        // TODO: Validate, generate JWT
        return ResponseEntity.ok("mock-jwt-token");
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Auth Service is healthy!";
    }
}
