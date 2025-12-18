package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.list;

@Entity
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
}