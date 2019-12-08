package com.sda.spring_school.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private static final String ID_GENERATOR = "id_generator";
    private static final String ID_SEQUENCE = "id_sequence";

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ID_GENERATOR)
//    @SequenceGenerator(name= ID_GENERATOR, sequenceName = ID_SEQUENCE)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "class")
    private String group;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
