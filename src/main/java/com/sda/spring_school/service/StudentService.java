package com.sda.spring_school.service;

import com.sda.spring_school.dto.StudentDTO;
import com.sda.spring_school.entities.Student;
import com.sda.spring_school.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public void insertStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setGroup(studentDTO.getGroup());
        studentDAO.insertStudent(student);
    }
}
