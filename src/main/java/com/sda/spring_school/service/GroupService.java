package com.sda.spring_school.service;
import com.sda.spring_school.dto.GroupDTO;
import com.sda.spring_school.entities.Group;
import com.sda.spring_school.repository.GroupDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    private GroupDAO groupDAO;

    public void insertGroup(GroupDTO groupDTO) {

        Group group = new Group();
        group.setGroupName(groupDTO.getName());
        group.setStudentsNumber(groupDTO.getStudentsNumber());
        groupDAO.insertGroup(group);
    }

}
