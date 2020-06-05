package org.tyaa.javaee.hibernate;

import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                HibernateFactory.getSessionFactory();
    }
}
