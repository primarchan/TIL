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
            // Customer customer = new Customer("ID0003", "Hong");
            // em.persist(customer);  // Customer 객체가 영속 상태 (Managed)
            // em.detach(customer);  // Customer 객체가 준영속 상태 (Detached)

            // Customer foundCustomer = em.find(Customer.class, "ID0003");

            Customer customer = new Customer();
            customer.setName("Kim");
            customer.setRegisterDate(System.currentTimeMillis());
            em.persist(customer);

            System.out.println("========== Before Commit ==========");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

}
