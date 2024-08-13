package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;
import com.example.demo.enums.SexeEnum;
import com.example.demo.models.UserDto;

@Repository
public interface  UserRepository extends JpaRepository<User,Integer>{

    public List <User> findByNom(String nom);

    public List <User> findByAge(Integer age);

    public List <User> findBySexe(SexeEnum sexe);

    public Boolean findByEmail(String email);

    //public User save(UserDto userDto);

}
