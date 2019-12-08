package com.sda.spring_school.repository;

import com.sda.spring_school.config.HibernateUtil;
import com.sda.spring_school.entities.Group;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class GroupDAO {

    private HibernateUtil hibernateUtil = new HibernateUtil();
    public void insertGroup(Group group) {
        Session session = hibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(group);
        transaction.commit();
        session.close();
    }

}
