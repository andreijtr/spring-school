package com.sda.spring_school.service;

import com.sda.spring_school.dto.TeacherDTO;
import com.sda.spring_school.entities.Teacher;
import com.sda.spring_school.repository.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherDAO teacherDAO;

    public void insertTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(teacherDTO.getFirstName());
        teacher.setLastName(teacherDTO.getLastName());
        teacher.setDiscipline(teacherDTO.getDiscipline());
        teacherDAO.insertTeacher(teacher);
    }
}
