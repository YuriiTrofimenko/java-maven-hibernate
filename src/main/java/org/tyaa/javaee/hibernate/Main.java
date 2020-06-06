package org.tyaa.javaee.hibernate;

import org.hibernate.SessionFactory;
import org.tyaa.javaee.hibernate.entity.Role;
import org.tyaa.javaee.hibernate.entity.User;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                HibernateFactory.getSessionFactory();
        EntityManager em = sessionFactory.createEntityManager();
        Role r = new Role();
        r.setTitle("admin");
        em.getTransaction().begin();
        em.persist(r);
        em.getTransaction().commit();
        User u = new User();
        u.setFirstName("f1");
        u.setLastName("l1");
        u.setAge(20);
        u.setRole(r);
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }
}
