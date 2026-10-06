package edu.wctc.wholesale.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "product")
public class Product {

    @Id
    private Integer productId;

    private String name;

    private double cost;

    public Product() {
    }

}
