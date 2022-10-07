package com.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.employee.bean.Employee;

public class EmployeeDao {
	public static void addData() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = entityManagerFactory.createEntityManager();
        System.out.println("Connection Establish");
        Employee emp = new Employee(102, "Sham", 50000);
        em.getTransaction().begin();
        em.persist(emp);
      

        em.getTransaction().commit();
        System.out.println("Record Inserted");
        entityManagerFactory.close();
        em.close();
}
	public static void updateData() {
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = entityManagerFactory.createEntityManager();
        Employee emp = new Employee(101, "Shankar", 40000);
        em.getTransaction().begin();
        em.merge(emp);
        em.getTransaction().commit();
        System.out.println("Record Updated");
        em.close();
	}
	public static void deleteEmployee() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        Employee emp = em.find(Employee.class, 102);
        if(emp != null) {
            em.remove(emp);
            System.out.println("Record Removed");
        } else {
            System.out.println("No record Found");
        }
        em.getTransaction().commit();
        System.out.println("Record Updated");
        em.close();
    }
	public static void getEmployee() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        Employee emp = em.find(Employee.class, 101);
        if(emp != null) {
           
            System.out.println(emp);
        }
        em.getTransaction().commit();
        em.close();
    }
}

