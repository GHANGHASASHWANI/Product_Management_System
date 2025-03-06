package com.labmst.Service;

import java.util.List;
import com.labmst.Database.OrderItemDatabase;
import com.labmst.Model.OrderItem;

public class OrderItemManagement {
    private OrderItemDatabase orderItemDatabase;



    public void addOrderItem(OrderItem orderItem) {
        orderItemDatabase.saveAll(List.of(orderItem));
    }

    public void removeOrderItem(int id) {
        orderItemDatabase.deleteById(id);
    }

    public void removeAllOrderItems() {
        orderItemDatabase.deleteAll();
    }

    public OrderItem getOrderItem(int id) {
        return orderItemDatabase.findById(id);
    }
    
    public List<OrderItem> getAllOrderItems() {
        return orderItemDatabase.findAll();
    }
}
