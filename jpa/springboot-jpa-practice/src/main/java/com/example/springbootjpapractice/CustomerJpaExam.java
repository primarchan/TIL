package com.example.springbootjpapractice;

import com.example.springbootjpapractice.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerJpaExam {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer-exam");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try {
            Customer customer = new Customer("ID0001", "Kim");
            em.persist(customer);  // Insert X

            Customer cus01 = em.find(Customer.class, "ID0001");
            System.out.println(cus01.toString());

            tx.commit();  // Insert O
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

}
