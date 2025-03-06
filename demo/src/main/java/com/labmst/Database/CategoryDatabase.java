package com.labmst.Database;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.labmst.Model.Category;

public interface CategoryDatabase extends JpaRepository<Category, Integer> {

    void saveAll(List<Category> category);

    void deleteById(int id);

    void deleteAll();
    
    Category findById(int id);

    List<Category> findAll();

}
