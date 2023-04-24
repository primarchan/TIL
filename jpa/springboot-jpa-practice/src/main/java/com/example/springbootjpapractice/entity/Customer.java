package com.example.springbootjpapractice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "customer_tb")
@Entity
@ToString
@NoArgsConstructor
public class Customer {

    @Id
    private String id;

    private String name;

    private Long registerDate;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.registerDate = System.currentTimeMillis();
    }

}
