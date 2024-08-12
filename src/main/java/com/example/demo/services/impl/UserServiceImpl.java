package com.example.demo.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.models.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {
   UserRepository userRepository;



    public UserServiceImpl(UserRepository userRepository){
    this.userRepository = userRepository;
}


    public User create(UserDto userDto) {
            if(userRepository.findByEmail(userDto.getEmail())){
                throw new RuntimeException("Email already exists");
            }
            return userRepository.save(userDto);
    }
    public List <User> findByNom(String nom) {
        return null;
    }
    public List <User> findByAge(Integer age) {
        return null;
       
    }
    public List <User> getAll() {
        return null;
    }
    public List <User> getAllMinerGirls() {
        return null;
    }
    public List <User> getAllBoys() {
        return null;
    }
   

}
