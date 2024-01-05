package com.fitns.controller;

import com.fitns.entity.Product;
import com.fitns.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveAllProducts(products);
    }

    @GetMapping("/getProducts")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findByProductId(@PathVariable Integer id){
        return service.getProductById(id);
    }

    @GetMapping("/product/{productName}")
    public List<Product> findProductByName(@PathVariable String productName){
        return service.getProductByName(productName);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
    return service.deletedProductById(id);
    }
}
