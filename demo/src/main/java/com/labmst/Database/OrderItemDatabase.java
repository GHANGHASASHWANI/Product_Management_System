package com.labmst.Database;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.labmst.Model.OrderItem;

public interface OrderItemDatabase extends JpaRepository<OrderItem, Integer> {
    
    void saveAll(List<OrderItem> orderItem);

    void deleteById(int id);

    void deleteAll();

    OrderItem findById(int id);

    List<OrderItem> findAll();
}

