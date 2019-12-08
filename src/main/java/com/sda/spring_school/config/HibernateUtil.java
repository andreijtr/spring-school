package com.sda.spring_school.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private SessionFactory sessionFactory;
    private Session session;

    public HibernateUtil () {
        //incarcam confg din hibernate.cfg
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        MetadataSources sources = new MetadataSources(registry);
        Metadata metadata = sources.getMetadataBuilder().build();
        //bazat pe cfg urile incarcate obtinem un sessionFactory
        sessionFactory = metadata.getSessionFactoryBuilder().build();
        this.session = sessionFactory.openSession();
    }

    public Session getSession() {
        return this.session;
    }
}
