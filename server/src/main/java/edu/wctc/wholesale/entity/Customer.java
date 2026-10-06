package edu.wctc.wholesale.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private Integer customerId;

    private String name;

    public Customer() {
    }

}