package com.labmst.Database;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.labmst.Model.Supplier;

public interface SupplierDatabase extends JpaRepository<Supplier, Integer> {

    void saveAll(List<Supplier> supplier);

    void deleteById(int id);

    void deleteAll();
    
    Supplier findById(int id);

    List<Supplier> findAll();
    
}
