package com.NgomaHebshi.Produktdatenbank;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity

public class Product {

    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

    private String name;
    private String description;
    private double price;

    public String getName() {
        return name;
    }
     public String getDescription() {
        return description;
    }
     public String getPrice() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

        public void setDescription(String name) {
        this.description = description;
    }

        public void setPrice(String name) {
        this.price = price;
     }
        }
