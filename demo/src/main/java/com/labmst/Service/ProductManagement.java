package com.labmst.Service;
import java.util.List;
import com.labmst.Database.ProductDatabase;
import com.labmst.Model.Product;

public class ProductManagement {
    private ProductDatabase productDatabase;

    public void addProduct(Product product) {
        productDatabase.saveAll(List.of(product));
    }

    public void removeProduct(int id) {
        productDatabase.deleteById(id);
    }

    public void removeAllProducts() {
        productDatabase.deleteAll();
    }

    public Product getProduct(int id) {
        return productDatabase.findById(id);
    }

    public List<Product> getAllProducts() {
        return productDatabase.findAll();
    }
}
