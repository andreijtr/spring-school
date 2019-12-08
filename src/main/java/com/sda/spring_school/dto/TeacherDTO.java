package com.sda.spring_school.dto;

public class TeacherDTO {

    private String firstName;
    private String lastName;
    private String discipline;

    public TeacherDTO(String firstName, String lastName, String discipline) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.discipline = discipline;
    }

    public TeacherDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
