package com.sda.spring_school.frontend;

import com.sda.spring_school.dto.GroupDTO;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class GroupFrontend {

    public GroupDTO readGroup() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give group's name:");
        String groupName = scanner.next();

        System.out.println("Give group's number of Students:");
        int studentsNumber = scanner.nextInt();

        GroupDTO groupDTO = new GroupDTO(groupName, studentsNumber);

        return groupDTO;
    }
}
