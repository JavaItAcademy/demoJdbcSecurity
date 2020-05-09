package kg.itacademy.demoJdbcSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/testAdmin")
    public String testAdmin() {
        return "Hello";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/testUser")
    public String testUser() {
        return "World";
    }
}
