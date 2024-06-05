package com.fitns.controller;

import com.fitns.entity.Product;
import com.fitns.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    public static Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        logger.info("Adding Product");
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        logger.info("Adding Product's");
        return service.saveAllProducts(products);
    }

    @GetMapping("/getProducts")
    public List<Product> findAllProducts(){
        logger.info("Adding Products");
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findByProductId(@PathVariable Integer id){
        logger.info("find product by id ");
        return service.getProductById(id);
    }

    @GetMapping("/product/{productName}")
    public List<Product> findProductByName(@PathVariable String name){
        logger.info("find product by name");
        return service.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        logger.info("update product execute ");
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){

    return service.deletedProductById(id);
    }
}
