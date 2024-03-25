package person.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import person.apirest.model.User;
import person.apirest.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> listAll(){
        return userRepository.findAllUsers();
    }

    @GetMapping("/user/{login}")
    public User getUser(@PathVariable("login") String login){
        return userRepository.findUserLogin(login);
    }
}
