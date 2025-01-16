package ru.chariot.faceitparser.controller;

import org.springframework.web.bind.annotation.*;
import ru.chariot.faceitparser.model.User;
import ru.chariot.faceitparser.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/allusers")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping("/{id}")
    public User putUser(@PathVariable("id") Long id, User user){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/{id}")
    public User deleteUserById(@PathVariable("id") Long id){
        return userService.deleteUser(id);
    }
}
