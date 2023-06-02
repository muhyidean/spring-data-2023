package edu.miu.springdata1.dto.output;

import edu.miu.springdata1.entity.Product;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private int id;
    private String email;
//    private String password;
    private String firstname;
    private String lastname;


}
