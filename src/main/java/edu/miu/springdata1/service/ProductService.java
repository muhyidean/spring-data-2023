package edu.miu.springdata1.service;


import edu.miu.springdata1.dto.input.ProductDto;
import edu.miu.springdata1.dto.output.ProductSimpleDto;
import edu.miu.springdata1.entity.Product;
import edu.miu.springdata1.entity.Review;

import java.util.List;

public interface ProductService {

//    void save(Product p);
    void save(ProductDto p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();

    ProductSimpleDto findDto(int id);

    Product testLazyObject();

    List<Review> searchReviewCriteria(String comment, Integer stars, Integer pId);



}
