package edu.miu.springdata1.entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

//    @ManyToMany
//    private List<Product> products;
}
