package com.example.demo.entities;

import java.util.List;

import com.example.demo.enums.SexeEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

    @OneToMany(mappedBy = "id")
    private List <Role> role;

    @OneToOne()
    private PassPort passPort;

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
