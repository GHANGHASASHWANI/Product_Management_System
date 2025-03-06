package com.labmst.Database;

import java.util.List;
import com.labmst.Model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderDatabase extends JpaRepository<PurchaseOrder, Integer> {

    void saveAll(List<PurchaseOrder> purchaseOrder);

    void deleteById(int id);

    void deleteAll();
    
    PurchaseOrder findById(int id);

    List<PurchaseOrder> findAll();
    
}
