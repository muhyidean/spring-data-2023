package edu.miu.springdata1.entity.joinedtable;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id_faculty")
public class FacultyJoined extends PersonJoined {

    private int salary;
    private String department;

}
