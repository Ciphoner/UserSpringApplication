package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.models.UserDto;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User create(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }

    @GetMapping("/searchNom/{nom}")
    public List<User> findByNom(@PathVariable("nom")  String nom) {
        return userService.findByNom(nom);
    }

    @GetMapping("/searchAge/{age}")
    public List<User> findByAge(@PathVariable("age") Integer age) {
        return userService.findByAge(age);

    }


    @GetMapping("/list")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/listMinerGirls")
    public List<User> getAllMinerGirls() {
        return userService.getAllMinerGirls();
    }
    @GetMapping("/listBoys")
    public List<User> getAllBoys() {
        return userService.getAllBoys();
    }

}
