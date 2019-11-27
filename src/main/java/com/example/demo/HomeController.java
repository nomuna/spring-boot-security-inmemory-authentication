package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String greeting(Authentication authentication){
        if (logger.isDebugEnabled()) {
            logger.debug("User: {}", authentication.getPrincipal());
        }
        return "home";
    }

    @GetMapping("/admin")
    public String admin(Authentication authentication){
        if (logger.isDebugEnabled()) {
            logger.debug("User: {}", authentication.getPrincipal());
        }
        return "admin";
    }
}
