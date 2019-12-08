package com.sda.spring_school.repository;

import com.sda.spring_school.config.HibernateUtil;
import com.sda.spring_school.entities.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

    private HibernateUtil hibernateUtil;

    public StudentDAO() {
        hibernateUtil = new HibernateUtil();
    }

    public void insertStudent(Student student) {
        Session session = hibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
    }
}
