package edu.miu.springdata1.entity.singletable;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
@DiscriminatorValue("2")
public class Student extends Person {

    private String major;
    private int tuitionFee;
}
