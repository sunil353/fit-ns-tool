package com.fitns.service;

import com.fitns.entity.Product;
import com.fitns.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        if(product !=null){
            repository.save(product);
        }
        return product;
    }

    public List<Product> saveAllProducts(List<Product> products){
        if(products !=null){
            repository.saveAll(products);
        }
        return products;
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int productId){
        return  repository.findById(productId).orElse(null);
    }

    public List<Product> getProductByName(String name){
        return repository.findByName(name);
    }


    public String deletedProductById(Integer id){
        repository.deleteById(id);
        return "Product Removed || "+id;
    }

    public Product updateProduct(Product product){
        Product existingProduct=null;
        if(product !=null){
            existingProduct =  repository.findById(product.getId()).orElse(null);
            if(product.getName() !=null){
                existingProduct.setName(product.getName());
            }
            if(product.getQuantity() !=0){
                existingProduct.setQuantity(product.getQuantity());
            }
            if(product.getPrice() !=0){
                existingProduct.setPrice(product.getPrice());
            }
            if(product.getStartDate() !=null){
                existingProduct.setStartDate(product.getStartDate());
            }
            if(product.getEndDate() !=null){
                existingProduct.setEndDate(product.getEndDate());
            }
            if(product.getStatus() !=null){
                existingProduct.setStatus(product.getStatus());
            }
        }
        return repository.save(existingProduct);
    }

}
