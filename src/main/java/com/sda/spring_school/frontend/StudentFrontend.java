package com.sda.spring_school.frontend;

import com.sda.spring_school.dto.StudentDTO;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class StudentFrontend {

    public StudentDTO readStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give student's first name:");
        String firstName = scanner.next();

        System.out.println("Give student's last name:");
        String lastName = scanner.next();

        System.out.println("Give student's group:");
        String group = scanner.next();

        StudentDTO studentDTO = new StudentDTO(firstName, lastName, group);

        return studentDTO;
    }
}
