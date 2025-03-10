package com.labmst.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Product")
public class Product {
    @Id
    private int product_id;
    private String product_name;
    private double product_price;
    private int product_quantity;
    private String product_description;
}
