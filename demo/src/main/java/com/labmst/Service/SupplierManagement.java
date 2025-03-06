package com.labmst.Service;

import java.util.List;
import com.labmst.Database.SupplierDatabase;
import com.labmst.Model.Supplier;

public class SupplierManagement {
    private SupplierDatabase supplierDatabase;


    public void addSupplier(Supplier supplier) {
        supplierDatabase.saveAll(List.of(supplier));
    }

    public void removeSupplier(int id) {
        supplierDatabase.deleteById(id);
    }

    public void removeAllSuppliers() {
        supplierDatabase.deleteAll();
    }

    public Supplier getSupplier(int id) {
        return supplierDatabase.findById(id);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierDatabase.findAll();
    }
    
}
