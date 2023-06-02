package edu.miu.springdata1.controller;


import edu.miu.springdata1.dto.input.ProductDto;
import edu.miu.springdata1.dto.output.ProductSimpleDto;
import edu.miu.springdata1.entity.Product;
import edu.miu.springdata1.entity.Review;
import edu.miu.springdata1.repo.ProductRepo;
import edu.miu.springdata1.repo.ReviewSearchDao;
import edu.miu.springdata1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
//
//    @PostMapping
//    public void save(@RequestBody Product p) {
//        productService.save(p);
//    }


    @PostMapping
    public void save(@RequestBody ProductDto p) {
        productService.save(p);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable int id) {
        var product = productService.getById(id);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {

        productService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int productId) {
        //call service
    }

    @GetMapping("/{id}/reviews")
    public List<Review> getReviewsByProductId(@PathVariable int id) {
        return productService.getById(id).getReviews();
    }

//    @GetMapping("/{id}/test")
//    public ResponseEntity test(@PathVariable int id) {
//        // for demo purposes, this request is not authorized.
//        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
//    }

    // FOR DEMO PURPOSES
    @Autowired
    ProductRepo productRepo;

    @GetMapping("filter/price/{price}")
    public List<Product> findPrice(@PathVariable("price") float price){
        return productRepo.findByPriceGreaterThan(price);
    }


    @GetMapping("filter/review/{num}")
    public List<Product> findPrice(@PathVariable("num") int num){
        return productRepo.findProductWithReviews(num);
    }


    @GetMapping("/{id}/dto")
    public ProductSimpleDto findDto(@PathVariable int id){
        return productService.findDto(id);
    }


    @GetMapping("filter/{name}")
    public List<Product> findByName(@PathVariable("name") String name){
        return productRepo.findProductByName(name);
    }

    @GetMapping("/{id}/reviews/filter")
    public List<Review> searchReviews(
            @PathVariable("id")Integer id,
            @RequestParam(value = "comment", required = false) String comment,
            @RequestParam(value = "stars",required = false) Integer stars){
        return productService.searchReviewCriteria(comment,stars,id);
    }

}
