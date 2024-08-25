package com.geff.login.controller;


import com.geff.login.model.User;
import com.geff.login.service.UserService;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin
@EnableWebSecurity
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable(name = "userId") Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        userService.saveUser(user);
        user.setUserPassword("");
        return user;
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable(name = "userId") Long id) {
        userService.deleteUser(id);
    }

}
