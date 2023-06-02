package edu.miu.springdata1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "test",sequenceName = "product_id_seq")
    private int id;

    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @JsonManagedReference
    @JoinColumn(name = "user_id")
    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY) // , fetch = FetchType.LAZY
    @Fetch(FetchMode.SELECT)
    private List<Product> products;
}
