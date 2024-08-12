package com.example.demo.models;

import com.example.demo.enums.SexeEnum;

public class UserDto {

    private String nom;
    private Integer age;
    private String email;
    private SexeEnum sexe;

 
    
    public UserDto(String nom, int age,SexeEnum sexe, String email) {
        this.nom = nom;
        this.age = age;
        this.sexe=sexe;
        this.email = email;
    }
    public String getEmail() {
       return this.email;
    }
    public Integer getAge() {
        return this.age;
     }
     public String getNom() {
        return this.nom;
     }
     public SexeEnum getSexe(){
        return this.sexe;
     }
}
