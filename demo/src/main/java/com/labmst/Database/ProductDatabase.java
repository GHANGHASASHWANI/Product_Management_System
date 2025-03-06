package com.labmst.Database;
import com.labmst.Model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductDatabase extends JpaRepository<Product, Integer> {

    void saveAll(List<Product> product);

    void deleteById(int id);

    void deleteAll();

    Product findById(int id);

    List<Product> findAll();

}
