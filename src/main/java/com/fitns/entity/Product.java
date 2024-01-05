package com.fitns.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCT_TB")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_quantity")
    private int productQuantity;
    @Column(name = "product_price")
    private double productPrice;


}
