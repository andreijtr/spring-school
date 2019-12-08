package com.sda.spring_school.dto;

public class GroupDTO {

    private String name;
    private int studentsNumber;

    public GroupDTO(String name, int studentsNumber) {
        this.name = name;
        this.studentsNumber = studentsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }
}
