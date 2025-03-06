package com.labmst.Service;

import java.util.List;

import com.labmst.Database.CategoryDatabase;
import com.labmst.Model.Category;

public class CategoryManagement {
    private CategoryDatabase categoryDatabase;


    public void addCategory(Category category) {
        categoryDatabase.saveAll(List.of(category));
    }

    public void removeCategory(int id) {
        categoryDatabase.deleteById(id);
    }

    public void removeAllCategories() {
        categoryDatabase.deleteAll();
    }

    public Category getCategory(int id) {
        return categoryDatabase.findById(id);
    }

    public List<Category> getAllCategories() {
        return categoryDatabase.findAll();
    }
    
}
