package com.example.springbootjpapractice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Table(name = "customer_tb")
@Entity
@ToString
@NoArgsConstructor
@SequenceGenerator(name = "customer_generator", sequenceName = "customer_seq", initialValue = 1, allocationSize = 50)
public class Customer {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    private String id;

    private String name;

    private Long registerDate;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.registerDate = System.currentTimeMillis();
    }

}
