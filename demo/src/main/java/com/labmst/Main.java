package com.labmst;

import com.labmst.Model.*;
import com.labmst.Service.*;

public class Main {
    public static void main(String[] args) {

        CategoryManagement categoryManagement = new CategoryManagement();
        ProductManagement productManagement = new ProductManagement();
        SupplierManagement supplierManagement = new SupplierManagement();
        OrderItemManagement orderManagement = new OrderItemManagement();
        PurchaseOrderManagement purchaseOrderManagement = new PurchaseOrderManagement();

        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Add Product");
            System.out.println("2. Add Category");
            System.out.println("3. Add Supplier");
            System.out.println("4. Add Order");
            System.out.println("5. Add Purchase");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    productManagement.addProduct(new Product());
                    break;
                case 2:
                    categoryManagement.addCategory(new Category());
                    break;
                case 3:
                    supplierManagement.addSupplier(new Supplier());
                    break;
                case 4:
                    orderManagement.addOrderItem(new OrderItem());
                    break;
                case 5:
                    purchaseOrderManagement.addPurchaseOrder(new PurchaseOrder());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}