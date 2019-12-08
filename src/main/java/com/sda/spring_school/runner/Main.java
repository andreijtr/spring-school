package com.sda.spring_school.runner;

import com.sda.spring_school.config.DIConfig;
import com.sda.spring_school.dto.GroupDTO;
import com.sda.spring_school.dto.StudentDTO;
import com.sda.spring_school.dto.TeacherDTO;
import com.sda.spring_school.entities.Teacher;
import com.sda.spring_school.frontend.GroupFrontend;
import com.sda.spring_school.frontend.StudentFrontend;
import com.sda.spring_school.frontend.TeacherFrontend;
import com.sda.spring_school.service.GroupService;
import com.sda.spring_school.service.StudentService;
import com.sda.spring_school.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfig.class);
        StudentService studentService = applicationContext.getBean(StudentService.class);
        StudentFrontend studentFrontend = applicationContext.getBean(StudentFrontend.class);
        TeacherFrontend teacherFrontend = applicationContext.getBean(TeacherFrontend.class);
        TeacherService teacherService = applicationContext.getBean(TeacherService.class);
        GroupFrontend groupFrontend = applicationContext.getBean(GroupFrontend.class);
        GroupService groupService = applicationContext.getBean(GroupService.class);

//        TeacherDTO teacherDTO = teacherFrontend.readTeacher();
//        teacherService.insertTeacher(teacherDTO);

        GroupDTO groupDTO = groupFrontend.readGroup();
        groupService.insertGroup(groupDTO);


    }
}
