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
            // em.persist(Customer.sample());  // 생성
            Customer foundCustomer = em.find(Customer.class, "ID0001");  // 조회
            System.out.println(foundCustomer.toString());
            // foundCustomer.setName("Park");  // 수정
            em.remove(foundCustomer);  // 삭제

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

}
