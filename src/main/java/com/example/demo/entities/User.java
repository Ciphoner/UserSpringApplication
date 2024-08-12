package com.example.demo.entities;

import com.example.demo.enums.SexeEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;


@Entity
@Data
public class User {
    @Id
    private Integer id;
    private String nom;
    private Integer age;
    private String email;
    private SexeEnum sexe;

    public User(String nom, Integer age, SexeEnum sexe, String email) {
        this.nom = nom;
        this.age = age;
        this.sexe=sexe;
        this.email=email;
    }
    public String getNom(){
        return this.nom;
    }
    public Integer getAge(){
        return this.age;
    }

}
