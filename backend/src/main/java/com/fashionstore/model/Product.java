package com.fashionstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private Double price;

    // Getters and Setters
}
