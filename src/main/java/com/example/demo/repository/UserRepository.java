package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;
import com.example.demo.models.UserDto;

@Repository
public interface  UserRepository extends JpaRepository<User,Integer>{

    public List <User> findByNom(String nom);

    public List <User> findByAge(Integer age);

    @Query("SELECT * FROM user WHERE user.sexe='FEMININ' AND user.age<18")
    public List <User> findByAgeUnderEighteen();

    public Boolean findByEmail(String email);

    public User save(UserDto userDto);

    @Query("SELECT * FROM user WHERE user.sexe='MASCULIN'")
    public List <User> findAllBoy();
}
