package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class PassPort {
    @Id
    private Integer Id;
    private long numero;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    
    public PassPort(Integer id, long numero) {
        Id = id;
        this.numero = numero;
    }


    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    
}
