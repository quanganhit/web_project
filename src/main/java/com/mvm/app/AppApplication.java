package com.mvm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@RestController
public class AppApplication {

    @GetMapping("/")
    public String redirectToProducts() {
        return "Welcome to my api";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
