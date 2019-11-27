package com.example.demo;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greeting(Authentication authentication){
        System.out.printf("User : %s", authentication.getPrincipal());
        return "home";
    }

    @GetMapping("/admin")
    public String admin(Authentication authentication){
        System.out.printf("User : %s", authentication.getPrincipal());
        return "admin";
    }
}
