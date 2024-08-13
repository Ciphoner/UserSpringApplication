package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
            User user=new User(userDto.getNom(),userDto.getAge(),userDto.getSexe(), userDto.getEmail());
            return userRepository.save(user);
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
        return userRepository.findBySexe(SexeEnum.FEMININ).stream().filter(u->{
            return u.getAge()>=18;
        }).collect(Collectors.toList());
    }

    @Override
    public List <User> getAllBoys() {
        return userRepository.findAll().stream().filter(u->{
            return u.getSexe().equals(SexeEnum.MASCULIN);
        }).collect(Collectors.toList());
    }
   

}
