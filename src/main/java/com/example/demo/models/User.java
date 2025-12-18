package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.list;

@Entity
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;

    public Long getId(){
        return id;
    }
     public String getUsername(){
        return username;
    }
      public String getEmail(){
        return Email;
    }
     public String getPassword(){
        return Password;
    }
    

}