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
@TableGenerator(name = "id_generator", table = "customer_id",pkColumnName = "id_name", pkColumnValue = "customer_id", valueColumnName = "next_value", initialValue = 0, allocationSize = 1)
public class Customer {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "id_generator")
    private String id;

    private String name;

    private Long registerDate;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.registerDate = System.currentTimeMillis();
    }

}
