package com.sda.spring_school.repository;

import com.sda.spring_school.config.HibernateUtil;
import com.sda.spring_school.entities.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDAO {

    private HibernateUtil hibernateUtil;

    public TeacherDAO() {
        hibernateUtil = new HibernateUtil();
    }

    public void insertTeacher(Teacher teacher) {
        Session session = hibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(teacher);
        transaction.commit();
        session.close();
    }
}
