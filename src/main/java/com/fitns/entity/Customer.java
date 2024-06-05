package com.fitns.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CUSTOMER_TB")
public class Customer {


    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="mobile_number")
    private long mobileNumber;

    @Column(name="address")
    private String Address;


}
