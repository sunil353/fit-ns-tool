package com.fitns.service;

import com.fitns.entity.Product;
import com.fitns.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveAllProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int productId){
        return  repository.findById(productId).orElse(null);
    }

    public List<Product> getProductByName(String productName){
        return repository.findByProductName(productName);
    }


    public String deletedProductById(Integer id){
        repository.deleteById(id);
        return "Product Removed || "+id;
    }

    public Product updateProduct(Product product){
       Product existingProduct =  repository.findById(product.getProductId()).orElse(null);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductQuantity(product.getProductQuantity());
        existingProduct.setProductPrice(product.getProductPrice());
        return repository.save(existingProduct);
    }

}
