package person.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    String welcome(){
        return "Welcome to my first Spring Boot Web API";
    }
}
