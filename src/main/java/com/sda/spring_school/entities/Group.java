package com.sda.spring_school.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "groupss")
public class Group {

    @Id
    private int id;
    @Column (name = "group_name")
    private String groupName;
    @Column (name =  "group_student_number")
    private int studentsNumber;

    public Group(String groupName, int studentsNumber) {
        this.groupName = groupName;
        this.studentsNumber = studentsNumber;
    }

    public Group() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }
}
