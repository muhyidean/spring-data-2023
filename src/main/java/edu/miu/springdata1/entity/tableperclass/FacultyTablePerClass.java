package edu.miu.springdata1.entity.tableperclass;
//
import edu.miu.springdata1.entity.tableperclass.PersonTablePerClass;
import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class FacultyTablePerClass extends PersonTablePerClass {

    private int salary;
    private String department;

}
