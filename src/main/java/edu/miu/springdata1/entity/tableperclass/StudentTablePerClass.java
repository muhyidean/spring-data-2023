package edu.miu.springdata1.entity.tableperclass;

import lombok.Data;

import jakarta.persistence.*;
@Entity
@Data
public class StudentTablePerClass extends PersonTablePerClass {

    private String major;
    private int tuitionFee;
}
