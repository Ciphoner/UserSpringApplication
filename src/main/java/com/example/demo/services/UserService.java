package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.User;
import com.example.demo.models.UserDto;

public interface UserService {
    public User create(UserDto user);
    public List <User> findByNom(String nom);
    public List <User> findByAge(Integer age);
    public List <User> getAll();
    public List <User> getAllMinerGirls();
    public List <User> getAllBoys();
}
