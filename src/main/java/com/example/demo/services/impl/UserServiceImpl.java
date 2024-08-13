package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.enums.SexeEnum;
import com.example.demo.models.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {

   UserRepository userRepository;
   

    public UserServiceImpl(UserRepository userRepository){
    this.userRepository = userRepository;
    
}

    @Override
    public User create(UserDto userDto) {
            if(userRepository.findByEmail(userDto.getEmail())){
                throw new RuntimeException("Email already exists");
            }
            return userRepository.save(userDto);
    }

    @Override
    public List <User> findByNom(String nom) {
        return userRepository.findByNom(nom);
    }
    
    @Override
    public List <User> findByAge(Integer age) {
        return userRepository.findByAge(age);
       
    }

    @Override
    public List <User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public List <User> getAllMinerGirls() {
        return userRepository.findByAgeUnderEighteen();
    }

    @Override
    public List <User> getAllBoys() {
        return userRepository.findAllBoy();
    }
   

}
