package edu.miu.springdata1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;

//    @OneToMany
//     UNCOMMENT FOR UNI-DIRECTIONAL JOIN COLUMN
//    @JoinColumn(name = "product_id")

    // UNCOMMENT FOR BI-DIRECTIONAL JOIN COLUMN
    @OneToMany(cascade = CascadeType.ALL)
    @Fetch(FetchMode.SELECT)
    @JsonManagedReference
    @JoinColumn(name = "product_id")
    @BatchSize(size = 5)
    private List<Review> reviews;

    @ManyToOne()
    @JsonBackReference
    private User user;

//    @ManyToMany(mappedBy = "products")
//    private List<Category> categories;

}
