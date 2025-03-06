package com.labmst.Service;

import java.util.List;
import com.labmst.Database.PurchaseOrderDatabase;
import com.labmst.Model.PurchaseOrder;

public class PurchaseOrderManagement {
    private PurchaseOrderDatabase purchaseOrderDatabase;

    public void addPurchaseOrder(PurchaseOrder purchaseOrder) {
        purchaseOrderDatabase.saveAll(List.of(purchaseOrder));
    }

    public void removePurchaseOrder(int id) {
        purchaseOrderDatabase.deleteById(id);
    }

    public void removeAllPurchaseOrders() {
        purchaseOrderDatabase.deleteAll();
    }

    public PurchaseOrder getPurchaseOrder(int id) {
        return purchaseOrderDatabase.findById(id);
    }

    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderDatabase.findAll();
    }

}
