package com.sda.spring_school.frontend;

import com.sda.spring_school.dto.TeacherDTO;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class TeacherFrontend {

    public TeacherDTO readTeacher() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give teacher's first name:");
        String firstName = scanner.next();

        System.out.println("Give teacher's last name:");
        String lastName = scanner.next();

        System.out.println("Give teacher's discipline:");
        String discipline = scanner.next();

        TeacherDTO teacherDTO = new TeacherDTO(firstName, lastName, discipline);

        return teacherDTO;
    }
}
